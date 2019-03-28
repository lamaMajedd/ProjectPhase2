package project;

import java.io.*;

public class QuestionBank {

    private String courseName;
    private Question[] qList;
    private int nOfQ;

    public QuestionBank(String courseName) {
        this.courseName = courseName;
        qList = new Question[100];
        nOfQ = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public Question[] getqList() {
        return qList;
    }

    public int getnOfQ() {
        return nOfQ;
    }
     
    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public void setqList(Question[] qList) {
        this.qList=qList;
    }

    public void setnOfQ(int nOfQ) {
        this.nOfQ=nOfQ;
    }
    

    public boolean addQuestion(Question q) {

        if (nOfQ == qList.length) {
            return false;
        }

        int found = findQuestion(q);
        if (found == -1) {

            if (q instanceof MCQ) {
                qList[nOfQ++] = new MCQ(q);
                return true;
            }

            if (q instanceof FillBlankQ) {
                qList[nOfQ++] = new FillBlankQ(q);
                return true;
            }

            if (q instanceof TrueFalseQ) {
                qList[nOfQ++] = new TrueFalseQ(q);
                return true;
            }

        }

        return false;

    }

    public void removeAllQuestion(String[] ids) {

        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < nOfQ; j++) {
                if (ids[i].equals(qList[j].getqID())) {
                    for (int k = j; k < nOfQ - 1; k++) {
                        qList[k] = qList[k + 1];
                    }

                    qList[--nOfQ] = null;
                    j--;
                }
            }
        }
    }

    public int findQuestion(Question q) {
        for (int i = 0; i < nOfQ; i++) {
            if (qList[i].getText().equals(q.getText()) || qList[i].getqID().equals(q.getqID())) {
                return i;
            }
        }
        return -1;

    }

    public int countChapterQuestions(String cName) {

        int count = 0;
        for (int i = 0; i < nOfQ; i++) {
            int underscore = qList[i].getqID().indexOf("_");
            if (cName.toLowerCase().equals(qList[i].getqID().substring(0, underscore).toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public int loadQuestions(String fName) throws IOException, ClassNotFoundException {
        if (!(fName.substring(0, fName.indexOf('.')).toLowerCase().equals(courseName.toLowerCase()))) {

            throw new IllegalArgumentException("File Name does't match the course !");
        }
        FileInputStream f = new FileInputStream(fName);
        ObjectInputStream inFile = new ObjectInputStream(f);
        int numQ = 0;
        while (true) {
            try {
                addQuestion(((Question) inFile.readObject()));
                numQ++;
            } catch (EOFException e) {
            System.out.println(numQ+" Qusetions have been loaded SUCCESSFULLY");
                break;
            }

        }
        inFile.close();
        return numQ;
    }

    public void saveQuestions() throws IOException, FileNotFoundException {
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(courseName.toLowerCase() + ".ser"));
        try {
            for (int i = 0; i < nOfQ; i++) {

                obj.writeObject(qList[i]);
            }
        } finally {
            obj.close();
        }

    }

    public Question[] getRandomQuestions(int n) {

        if (n == 0) {

            return null;

        }

        if (n > nOfQ) {

            throw new IllegalArgumentException();

        }

        int[] diff = new int[n];

        int o = 0;

        Question[] q = new Question[n];
        int min = 0;
        int max = nOfQ - 1;
        for (int i = 0; i < q.length; i++) {

            int rand = min + (int) (Math.random() * (max - min + 1));

            for (int j = 0; j < i; j++) {
                if (diff[j] == rand) {
                    rand = min + (int) (Math.random() * (max - min + 1));
                    j--;
                }
            }

            diff[o++] = rand;

            q[i] = qList[rand];
        }
        return q;

    }

    public Question[] getChapterQuestion(int n, String cName) {
        Question[] q;
        if (n == 0) {
            return null;
        }
        int size = countChapterQuestions(cName);
        if (size > n) {
            q = new Question[n];
        } else {
            q = new Question[size];
        }
        for (int i = 0, j = 0; j < q.length; i++) {
            if ((qList[i].getqID().substring(0, qList[i].getqID().indexOf('_')).toLowerCase()).equals(cName.toLowerCase())) {
                q[j++] = qList[i];
            }
        }

        return q;

    }

}
