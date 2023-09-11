/**
 *  LIONS YAYYYY
 *
 *@author    eknapp
 */
class Lion{
    /**
     *  Output lion noises
     */
    public void roar() {
        System.out.println("The lion gave a ferocious ROAR!!!");
    }

}


public class LionTestDrive{

    public static void main(String[] args){
        Lion mufasa = new Lion();
        mufasa.roar();

        Lion simba = new Lion();
        simba.roar();
    }

}

