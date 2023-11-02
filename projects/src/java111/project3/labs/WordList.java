import java.util.*;
public class WordList{
InputHelper ih1;
String outString = " ";
List<String> arr;
String[] profanityArray = {"lickorous", "jobbernol", "goosecap", "bobolyne", "cumberworld", "bellend", "knobhead"};

public void match(String inputString){
    for (int i = 0; i < profanityArray.length; i++){
        if (inputString.compareTo( profanityArray[i]) == 0){
            arr.set(arr.indexOf(inputString), inputString + "*");
        }
    }
}

public void run(){
    arr = new ArrayList<String>();
    while (true){
        InputHelper ih1 = new InputHelper();
        outString = ih1.getUserInput("Please enter a word, or \"quit\" to exit:");
        if (outString.equals("n")){
            arr.forEach(((n) -> match(n)));
            System.out.println("###### Your list of unique words ######" + "\n" +
                               "# An '*' denotes the use of profanity #" + "\n" +
                               "#######################################");
            arr.forEach(((n) -> System.out.println(n)));
            System.out.println("#######################################");
            break;
        } else if (!arr.contains(outString)) {
            arr.add(outString);
        }
    }
}
}