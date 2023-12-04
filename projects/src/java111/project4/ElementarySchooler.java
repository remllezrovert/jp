package java111.project4;
import java.util.ArrayList;
/**@author Trevor Zellmer */
public class ElementarySchooler extends Student implements TestTaker{
    ArrayList<String> degrees = new ArrayList<String>();
    /** @param studentId; @param studentName */
    public ElementarySchooler(int studentId, String studentName){
        super(studentId, studentName);
    }
    /** @returns String */
    public String toString(){
        return studentName + " has a student id of " + studentId;
    }
    /** @returns String */
    public String progressReport(){
        String degs = "";
        for(String i: degrees) 
            degs = degs.concat(", " + i);
        return studentName + " has a student id of " + studentId
        + "\n" + studentName + " has college degrees in" + degs;
    }
    /** @returns ArrayList */
    public ArrayList<String> getDegrees(){
        return degrees;
    }
    /** @param ArrayList */
    public void setDegrees(ArrayList<String> newDegrees){
        degrees = newDegrees;
    }


    //--------------------------------  TESTING THINGS --------------------------------------------------------
    private String[] testQuestions = {"What is your name?" , "What is your quest?" ,  "What is your favorite color?"};
    private String[] testAnswers = {this.studentName, "To seek the Holy Grail.", "Yellow"};
    private String[] testInput;
    private Test test = new Test(testQuestions, testAnswers);
    private String testResult;
    
/** @returns String[3] */
    public String[] getTestQuestions(){
        return testQuestions;
    }

    /** @param String[3] */
    public void setTestInput(String[] newTestInput){
        testInput = newTestInput;
    }
    public void takeTest(){
        testResult = test.gradeTest(testInput);
    }
    /** @returns testResult */
    public String getTestResults(){
        return testResult;
    }



}
