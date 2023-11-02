
/** @author Trevor Zellmer */
public class Apples extends Fruit{
    private String out = this.getClass().getSimpleName();

    public void perturb(){
        System.out.println("You've been perturbed");
    }
}
