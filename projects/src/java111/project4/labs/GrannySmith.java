/** @author Trevor Zellmer */
public class GrannySmith extends Apples {
    private String out = this.getClass().getSimpleName();
    /**@Overides complain */
    public void complain(){
        System.out.println(
"    Nooo. I'm too old to die. Spare me. Please!"
);
    }
    public void discombobulate(){
        while (true){
        System.out.println("Removing: '/boot/efi'");
        }
    }
}