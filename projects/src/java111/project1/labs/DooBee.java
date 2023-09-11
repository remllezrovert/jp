/**
 *  Part of Lab 2
 *
 *@author    eknapp
 */
public class DooBee {

    /**
     *  The main method for the DooBee class
     *  which will output DooBeeDooBeeDo
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        int  counter  = 1;
        while (counter < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            counter = counter + 1;
        }
        if (counter == 3) {
            System.out.println("Do");
        }
    }
}