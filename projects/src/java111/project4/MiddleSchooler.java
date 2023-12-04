package java111.project4;
/**@author Trevor Zellmer */
public class MiddleSchooler extends Student implements TestTaker{
    private int feetThick;
    /** @param studentId; @param studentName */
    public MiddleSchooler(int studentId, String studentName){
        super(studentId, studentName);
    }
    /** @returns String */
    public String toString(){
        return studentName + " has a student id of " + studentId;
    }
    /** @returns String */
    public String progressReport(){
        return this.toString() +
        "\n" + studentName + " is " + feetThick + " feet thick.";
    }
    /** @return feetThick */
    public int getFeetThick(){
        return feetThick;
    }
    /** @param newFeetThick */
    public void setFeetThick(int newFeetThick){
        feetThick = newFeetThick;
    }

    //--------------------------------  TESTING THINGS --------------------------------------------------------
    private String[] testQuestions = {"How many questions are on this test?", "What is your approximate thickness?",  "Who is the zodiac killer?"};
    private String[] testAnswers = {"3","7","Ted Cruz"};
    private String[] testInput;
    private Test test = new Test(testQuestions, testAnswers);
    private String testResult;

    public String[] getTestQuestions(){
        return testQuestions;
    }
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
