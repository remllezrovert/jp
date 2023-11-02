public class Lab4TestDrive {
public static void main(String[] args){
Lab5 g1 = new Lab5();
if (g1.guess(g1.goldenNumber + 1) == "Guess Lower"){
    System.out.println("High Guess: Tests Passed");
    if ( g1.guess(g1.goldenNumber - 1) == "Guess Higher"){
        System.out.println("Low Guess: Tests Passed");
        if (g1.guess(g1.goldenNumber) == "Congratulations! Good guess!"){
            System.out.println("Correct Guess: Tests Passed");
        } else { System.out.println("Correct Guess: Tests Failed");}
    } else {System.out.println("Low Guess: Tests Failed");}
} else {System.out.println("High Guess: Tests Failed");}
}
}
