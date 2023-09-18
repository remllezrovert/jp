

public class FunWithNumbers{



    public void run(){
        int result = 0;
        double doubleResult = 0.0;
        int a = 5;
        int b = 10;
        int c = 3;
        int d = 25;
        result = a + b + c + d;
        doubleResult = (double)  (a * b * d) / c;
        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);
        System.out.print(a + " * " + b + " * " + d + " / " + c + " = ");
        System.out.printf("%.10f",doubleResult);
        System.out.println("\n");

    }
}


