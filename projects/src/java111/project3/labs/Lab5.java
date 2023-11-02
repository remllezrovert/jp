import java.util.Random;
public class Lab5 {
Random rand = new Random();
public int goldenNumber = rand.nextInt(10) + 1; //generate random number 1 - 10
public String guess(int newGuess){
if (newGuess > goldenNumber){
    return "Guess Lower";
}
if (newGuess < goldenNumber){
    return "Guess Higher";
}
if (newGuess == goldenNumber){
    return "Congratulations! Good guess!";
} else {
    return "Error";
}

}


}