
public class TestDogs{

    public static void main(String[] args){
        DogLabTwo dog1 = new DogLabTwo();
        DogLabTwo dog2 = new DogLabTwo();
        dog1.name = "Fido";
        dog2.name = "Spot";
        dog1.bark();
        dog2.bark();
        dog1 = dog2;
        dog1.bark();
        dog2.bark();
    }

}