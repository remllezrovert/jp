

public class Student{

private String name;
private int studentID = 9999999;
private int creditHours = 36;
private int gradePoints = 100;


//Setters
public void setName(String newName){
    name = newName;
}

public void setStudentID(int newStudentID){
    studentID = newStudentID;
}

public void setCreditHours(int newCreditHours){
    creditHours = newCreditHours;
}
 
public void setGradePoints(int newGradePoints){
    gradePoints = newGradePoints;
}

// Getters

public String getName(){
    return name;
}

public int getStudentID(){
    return studentID;
}

public int getCreditHours(){
    return creditHours;
}

public int getGradePoints(){
    return gradePoints;
}

// GPA calculator returns GPA

public double gradePointAverage(){
    return (double) gradePoints / creditHours;
}


//Display method
public void display(){
    System.out.println(name + " with id of " + studentID + ", has " + creditHours + " credit hours");
    System.out.println( "    and " + gradePoints + " grade points, resulting in a gpa of " + gradePointAverage());
}



}

