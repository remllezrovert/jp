package java111.project4;
/**@author Trevor Zellmer */
public class Kindergartner extends GeneralStudent{
    private String showAndTell;
    /** @param studentId; @param studentName */
    public Kindergartner(int studentId, String studentName){
        super(studentId, studentName);
    }
    /** @returns String */
    public String toString(){
        return studentName + " has a student id of " + studentId;
    }
    /** @returns String */
    public String progressReport(){
        return super.progressReport() + 
        "\n" + studentName + " is a kindergarten student and brought " + showAndTell + " for show and tell.";
    }

    /** @returns showAndTell */
    public String getShowAndTell(){
        return showAndTell;
    }
    /** @param showAndTell */
    public void setShowAndTell(String newItem){
        showAndTell = newItem;
    }
}
