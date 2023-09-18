

public class FruitCounter{

    Fruit[] fruitArray;
    int fruitCount;

    public void run(){
        Fruit f1 = new Fruit();
        f1.setFruit("apples", 10);

        Fruit f2 = new Fruit();
        f2.setFruit("oranges", 4);

        Fruit f3 = new Fruit();
        f3.setFruit("kumquats", 2);

        Fruit f4 = new Fruit();
        f4.setFruit("grapes", 39);

        Fruit f5 = new Fruit();
        f5.setFruit("blueberries", 26);

        Fruit f6 = new Fruit();
        f6.setFruit("bananas", 3);

        fruitArray = new Fruit[]{f1,f2,f3,f4,f5,f6};

        for (int i =0; i < fruitArray.length; i++){
            System.out.println("I have "+ fruitArray[i].getFruitNumber() + " " + fruitArray[i].getFruitName() + ".") ;
            fruitCount += fruitArray[i].getFruitNumber();
        }
        System.out.println("\n" + "Total peices of furit: " + fruitCount);
    }

}