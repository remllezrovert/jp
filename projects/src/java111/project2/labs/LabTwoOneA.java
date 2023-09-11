

// This is interesting and I clearly didn't read enough because I don't understand this. 
// I expected the quotient of a long and an int to be an int, which it was, it output exactly 15
// 78/5 = 15.6, I expected java to round up to sixteen, but instead it rounded down to 15???


public class LabTwoOneA{
    int intVar = 5;
    long longVar = 78;
    double doubleVar = 2.7;


    public void product(){
        double productVar = intVar * longVar * doubleVar;

        System.out.println(intVar + " * " + longVar + " * " + doubleVar + " = " + productVar + ". This is the expected output");
    }
    public void quotient(){
        long quotientVar = longVar / intVar;

        System.out.println(longVar + "/" + intVar + " = " + quotientVar + ". This is not the expeced output");
    }
    
}

