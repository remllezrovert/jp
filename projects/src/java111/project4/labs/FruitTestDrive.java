/** @author Trevor Zellmer */
public class FruitTestDrive{
    public static void main(String[] arge ){
        Fruit f1 = new Fruit();
        Apples a1 = new Apples();
        Jonagold j1 = new Jonagold();
        System.out.println("Here are my fruit classes: " + "\n"
            + f1.output() + "\n"
            + a1.output() + "\n"
            + j1.output()
        );

    }
}