/** @author Trevor Zellmer */
public class FruityTestDrive{
    public static void main(String[] arge ){
        Fruit f1 = new Fruit();
        Fruit a1 = new Fruit();
        Fruit j1 = new Fruit();
        System.out.println("Here are my fruit classes: " + "\n"
            + f1.output() + "\n"
            + a1.output() + "\n"
            + j1.output()
        );
	//a1.perturb();
	//j1.discombobulate();
	System.out.println("when I ran this method I saw compiler errors with the words 'cannot find symbol' in them.");

    }
}
