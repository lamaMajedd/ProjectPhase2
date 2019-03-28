
package project;

public class FillBlankQ extends Question {
 
    private String  correctAnswer ;

    public FillBlankQ( String text, String qID, double pGrade , String correctAnswer ) {
        super(text, qID, pGrade);
        this.correctAnswer = correctAnswer;
    }
    public FillBlankQ(Question q ) {
        super(q.text, q.qID, q.pGrade);
        correctAnswer = ((FillBlankQ)q).correctAnswer;
    } 

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    public String formattedQ(){
      return"Fill the Following blank\n"+ qID +":" +text;   
     }
        public String formattedQwithA(){
     return formattedQ()+ "Correct Answer is : "+correctAnswer ;
}
    
}