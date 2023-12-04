package java111.project4;
import java.util.ArrayList;
/**@author Trevor Zellmer */
public class GeneralStudent extends Student {
    public String homeRoomTeacher;
    public ArrayList<String> activities = new ArrayList<String>();
    /** @param studentId; @param studentName */
    public GeneralStudent(int studentId, String studentName){
        super(studentId, studentName);
    }
    /** @returns String */
    public String toString(){
        return studentName + " has a student id of " + studentId;
    }
    /** @returns String */
    public String progressReport(){
        String act = "";
        for(String i: activities) act = act.concat(", " + i);
        return this.toString() + 
        "\n" + studentName + "'s homeroom teacher is " + homeRoomTeacher +
        "\n" + studentName + "'s extracurricular activities include" + act;
    }
    // ------------------------------- Getters and setters ----------------------
    /** @param newActivity */
    public void setActivities(ArrayList<String> newActivities){
        activities = newActivities;
    }
    /** @returns activities */
    public ArrayList<String> getActivities(){
        return activities;
    }
   /** @param newHomeRoomTeacher */
    public void setHomeRoomTeacher(String newHomeRoomTeacher){
        homeRoomTeacher = newHomeRoomTeacher;
    }    
    /** @returns  homeRoomTeacher */
    public String getHomeRoomTeacher(){
        return homeRoomTeacher;
    }
}
