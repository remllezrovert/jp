package java111.project4;
/**@author Trevor Zellmer */
public class HighSchooler extends Student implements TestTaker{
    String smell;
    /** @param studentId; @param studentName */
    public HighSchooler(int studentId, String studentName){
        super(studentId, studentName);
    }
    /** @returns String */
    public String toString(){
        return studentName + " has a student id of " + studentId;

    }
    /** @returns String */
    public String progressReport(){
        return studentName + " has a student id of " + studentId +
        "\n" + studentName + " smells like " + smell;

    }
    /** @returns String */
    public String getSmell(){
        return smell;
    }
    /** @param String */
    public void setSmell(String newSmell){
        smell = newSmell;
    }

    //--------------------------------  TESTING THINGS --------------------------------------------------------

    private String[] testQuestions = {"What is your name?" , "What is your quest?" ,  "What is the airspeed velocity of an unladen swallow?"};
    private String[] testAnswers = {this.studentName, "To seek the Holy Grail.", "What do you mean? An African or European swallow?"};
    private String[] testInput;
    private Test test = new Test(testQuestions, testAnswers);
    private String testResult;

    /** @returns testQuestions */
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
