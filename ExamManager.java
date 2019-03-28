package project;

import java.io.*;

public class ExamManager {

    private QuestionBank qBank;

    public ExamManager(String courseName) {
        qBank = new QuestionBank(courseName);
         
        File f = new File(courseName.toLowerCase() + ".ser");
        if (!f.exists()) {
          System.out.println("Qestion Bank is Empty!");
            return;
        }
            try {
                qBank.loadQuestions(courseName.toLowerCase() + ".ser");
            } catch(FileNotFoundException e){
                System.out.println("Error: " + e.getMessage());
            }catch(IOException e){
                 System.out.println("Error: " + e.getMessage());
            }
            catch (ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } 
        
       
    }

    public QuestionBank getqBank() {
        return qBank;
    }
     public void setqBank(QuestionBank qBank) {
        this.qBank=qBank;
    }
    public boolean addNewQuestion(Question q) {
        return qBank.addQuestion(q);
    }

    public void removeChapterQuestions(String chapterName) {
        Question[] q = qBank.getqList();
        int size = qBank.countChapterQuestions(chapterName);
        String[] ch = new String[size];

        for (int i = 0, j = 0; i < q.length && j<size; i++) {
                if(q[i]!=null){
                if (q[i].getqID().substring(0, q[i].getqID().indexOf('_')).toLowerCase().equals(chapterName.toLowerCase())) {

                    ch[j++] = q[i].getqID();
                }
                }
            }

        

        qBank.removeAllQuestion(ch);
    }

    public double generateExam(String header, int n, String chapterName, boolean withAnswer) throws FileNotFoundException  {
        double grades = 0;
       
            File file = new File(qBank.getCourseName().toLowerCase() + "Exam.txt");
            FileOutputStream F = new FileOutputStream(file);
            PrintWriter P = new PrintWriter(F);

            P.println(header);

            Question[] Random;
            if (chapterName.equals("")) {
                Random = qBank.getRandomQuestions(n);
            } else {
                Random = qBank.getChapterQuestion(n, chapterName);
            }

            for (int i = 0; i < Random.length; i++) {
                grades += Random[i].getpGrade();

                if (withAnswer) {
                    P.println(Random[i].formattedQwithA());
                } else {
                    P.println(Random[i].formattedQ());
                }
            }
            P.close();
        

        return grades;
    }

    public void exportQBank() throws IOException {
        try {
            qBank.saveQuestions();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
