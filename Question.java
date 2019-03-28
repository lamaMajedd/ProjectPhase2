
package project;
import java.io.*;

public abstract class Question implements Serializable {
    
    protected String text ;
    protected String qID  ;
    protected double pGrade ;

    public Question(String text, String qID, double pGrade) {
        this.text = text;
        this.qID = qID;
        this.pGrade = pGrade;
    }
    
     public Question(Question q) {
        this.text = q.text;
        this.qID = q.qID;
        this.pGrade = q.pGrade;
    }
    
    

    public String getText() {
        return text;
    }

    public String getqID() {
        return qID;
    }

    public double getpGrade() {
        return pGrade;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setqID(String qID) {
        this.qID = qID;
    }

    public void setpGrade(double pGrade) {
        this.pGrade = pGrade;
    }
    
   public abstract String formattedQ();
   public abstract String formattedQwithA();
    
}