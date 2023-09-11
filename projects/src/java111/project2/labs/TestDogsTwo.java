
public class TestDogsTwo{

    public static void main(String[] args){
        DogLabTwo dog1 = new DogLabTwo();
        DogLabTwo dog2 = new DogLabTwo();
        DogLabTwo dog3 = new DogLabTwo();

        dog1.name = "Fido";
        dog2.name = "Spot";
        dog3.name = "Jazzy";
        

        dog1.bark();
        dog2.bark();
        dog3.bark();

        dog1 = dog2;
        dog3 = null;
        System.out.println("After assigning dog1 to dog2 AND assigning null to the third dog:");
        dog1.bark();
        dog2.bark();
        dog3.bark();
    }

}