/**
 * This is the first class in the first lab of the first semester of Java!
 * 
 * @author eknapp
 * 
 */
public class LabOneSelection {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 101;
        if (num > 100) {
           System.out.println("It's bigger than 100");
        } else { 
            /** This is technically unnecessary */
            if (num <= 100) {
                System.out.println("It's not bigger than 100");
            }
        }
    }

}