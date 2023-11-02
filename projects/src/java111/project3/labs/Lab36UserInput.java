public class Lab36UserInput {
InputHelper ih1;

String outString;
public void run(){
    while (true){
        InputHelper ih1 = new InputHelper();
        outString = ih1.getUserInput("Please enter a word, or \"quit\" to exit:");
        if (outString.equals("quit")){
            System.out.println("Goodbye!");
            break;
    } else {
        System.out.println("Your Wrote: " + outString);
    }

    }
}
}
