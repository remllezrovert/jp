
/** @author Trevor Zellmer */
public class Apples extends Fruit{
private String out = this.getClass().getSimpleName();

    /** @return class name */
    public String output(){
        return out;
    }

    public void complain(){
        System.out.println("Goodbye, I've accepted my fate.");
    }
    public void perturb(){
        System.out.println("You've been perturbed");
    }
}
