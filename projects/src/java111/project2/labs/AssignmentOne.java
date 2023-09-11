
public class AssignmentOne{
    int loopCounter = 10;
    double additionValue = 12.76;
    double totalValue = 0;

    public void runLoop(){

        System.out.print("Adding " + " to a total (where the total started at " + totalValue + ") " + loopCounter + " times results in: ");
        while(loopCounter > 0){
            totalValue = totalValue + additionValue;
            loopCounter -= 1;
        }
        System.out.println(totalValue);
    }
}