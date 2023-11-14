
public class Penguin extends Bird{
    private String sound = "**Gutteral Sqeaks of Primeval rage**";
    public void display(){
    System.out.println(this.sound + " I'm a "+ this.getClass().getSimpleName());
    }
}