package java111.project4;
/** @author Trevor Zellmer */
public abstract class Student {
    protected int studentId;
    protected String studentName;
    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public abstract String toString();
    public abstract String progressReport();

}

interface TestTaker{
    public String[] getTestQuestions();
    public void setTestInput(String[] testInput);
    public void takeTest();
    public String getTestResults();
}

//Ideally test would be completely separated from each subclass of student
//because there is a many to many relationship between students and tests.
//However the directions specify unqiue takeTest methods for each subclass
//and a parameterless takeTest() method, so I kind worked around it.
//As a result I have a stubby little Test class.

