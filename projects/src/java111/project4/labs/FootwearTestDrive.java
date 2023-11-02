
/** @author Trevor Zellmer */
public class FootwearTestDrive{

    public static void main(String[] args){
    System.out.println("Displaying Footwear");
    Footwear f1 = new Footwear();
    f1.setSize(12);
    f1.setBrand("Heelies");
    f1.setColor("Green");
    f1.display();
    System.out.println("");

Footwear f2 = new Footwear();
    f2.setSize(2);
    f2.setBrand("Evolv");
    f2.setColor("Gray");
    f2.display();
    System.out.println("\n");

    System.out.println("Displaying Boots");
    Boot b1 = new Boot();
    b1.setSize(12);
    b1.setBrand("Keens");
    b1.setColor("Brown");
    b1.setSpurs(false);
    b1.setHeight(10);
    b1.show();
    System.out.println("");

Boot b2 = new Boot();
    b2.setSize(8);
    b2.setBrand("Yeezys");
    b2.setColor("Orange");
    b2.setSpurs(true);
    b2.setHeight(22);
    b2.show();
    System.out.println("");



    }

}
