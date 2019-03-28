
package project;


public class MCQ extends Question {
    
    private int correctAnswer ;
    private String [] choices ;

    public MCQ( String text, String qID, double pGrade , int correctAnswer, String[] choices) {
        super(text, qID, pGrade);
        this.correctAnswer = correctAnswer;
        this.choices = choices;
    }
    
     public MCQ(Question q ) {
        super(q.text, q.qID, q.pGrade);
        correctAnswer = ((MCQ)q).correctAnswer;
        choices = ((MCQ)q).choices;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }
    
     public String formattedQ(){
      return "Choose the correct answer: \n"+qID+":"+text+"\n1:"+choices[0]+"\n2:"+choices[1]+"\n3:"+choices[2]+"\n4:"+choices[3];   
     }
    public String formattedQwithA(){
     return formattedQ()+"Correct Answer is : "+choices[correctAnswer] ;
}
}