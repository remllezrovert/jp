/**
 *  Assignment 2 Debug exercise. What is wrong with this code?
 *
 *@author    eknapp
 */
class Guy{
    /**
     *  Output the full name
     */
    public void fullName(String firstName, String lastName) {
        System.out.println("Here is the full name: " + firstName + " " + lastName);
    }

}



public class Assignment2Debug {

    public static void main(String[] args){
        Guy fred = new Guy();
        fred.fullName("Fred", "Flintstone");
    }

}

