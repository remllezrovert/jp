import java.util.ArrayList;

public class FruitBasket{

    ArrayList<Fruit> fruits = new ArrayList<Fruit>();
    public void createApples(){
    Jonagold j1 = new Jonagold();
    GrannySmith g1 = new GrannySmith();
    GoldenDelicious g2 = new GoldenDelicious();
    fruits.add(g2);
    fruits.add(j1);
    fruits.add(g1);
    }

    public void appleBasket(){
        System.out.println(" ===== These are the fruits in the basket ======");
        fruits.forEach((f) -> {
        System.out.println("Hello Friend, I am a " + f.output() + "!");
        });
    }

    public void appleObliterator(){
        System.out.println(" ======== You have activated the blender =======");
    FruitBlender blender1 = new FruitBlender();
    fruits.forEach((fruit) -> blender1.blender(fruit));
    }

}