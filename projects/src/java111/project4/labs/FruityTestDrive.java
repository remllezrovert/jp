/** @author Trevor Zellmer */
public class FruityTestDrive{
    public static void main(String[] arge ){
        Apples a1 = new Apples();
        Apples j1 = new Jonagold();
        System.out.println("Here are my fruit classes: " + "\n"
            + a1.output() + "\n"
            + j1.output()
        );
	//a1.perturb();
	//j1.discombobulate();
	System.out.println("when I ran this method I saw compiler errors with the words 'cannot find symbol' in them.");

    }
}
