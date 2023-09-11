
public class LabThree{
    public void sayHello(String name){
        System.out.println("Hello there " + name);
    }
    public void sayHelloAgain(String name, int loopCount){
        while(loopCount > 0){
        System.out.println("Hello there " + name);
        loopCount -= 1;
        }

    }
}