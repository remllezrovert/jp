/** @author Trevor Zellmer */
public class Jonagold extends Apples {
    private String out = this.getClass().getSimpleName();

    /**@Overides complain */
    public void complain(){
        System.out.println(
"    Why are we still here? Just to suffer? Every night, I can feel my leg... And my arm... even my fingers."
);
    }
    public void discombobulate(){
        while (true){
        System.out.println("Removing: 'C:\\Windows\\System32'");
        }
    }
}