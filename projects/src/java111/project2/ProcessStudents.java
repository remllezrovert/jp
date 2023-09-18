
public class ProcessStudents{
    private Student[] students;
    public void createStudents(){
        Student s1 = new Student();
        s1.setName("Suzie Creamcheese");

        Student s2 = new Student();
        s2.setName("Gene Ray");
        s2.setStudentID(4);
        s2.setCreditHours(4);
        s2.setGradePoints(4);

        Student s3 = new Student();
        s3.setName("Jeff Boyardee");
        s3.setStudentID(13);
        s3.setCreditHours(13);
        s3.setGradePoints(32);
        students = new Student[]{s1,s2,s3};

    }


    public void displayStudents(){

        for (int i = 0; i < students.length; i++){
            students[i].display();
        }
    }

    public void runStudentProcessing(){
        createStudents();
        displayStudents();
    }

}