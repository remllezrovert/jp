package java111.project5.labs;
import java.lang.Math;

/** @author Trevor Zellmer */
public class DoingTheMath {

    public static void main(String[] args){
        double x = Math.random() * 1000;
        double y = Math.sqrt(8.0);
        System.out.println(
        "My random number is " + x + ".\n\n" 
        + "The square root of 9.0 is " + Math.sqrt(9.0) + ".\n" 
        + "The square root of 144.0 is " + Math.sqrt(144.0) + ".\n" 
        + "The square root of 8.0 is " + y + ".\n\n" 
        + y + "rounded to the nearest int is " + Math.round(y) + ".\n"
        + "5.91 rounded to the nearest int is " + Math.round(5.91) + ".\n"
        + "3.14 rounded to the nearest int is " + Math.round(3.14) + ".\n"
        + "3.566667 rounded to the nearest int is " + Math.round(3.566667) + ".\n\n"
        + y + "rounded to the nearest tenth is " + Math.round(y * 10) / 10.0 + ".\n"
        + "5.91 rounded to the nearest tenth is " + Math.round(5.91 * 10) / 10.0 + ".\n"
        + "3.14 rounded to the nearest tenth is " + Math.round(3.14 * 10) / 10.0 + ".\n"
        + "3.566667 rounded to the nearest tenth is " + Math.round(3.566667 * 10.0) / 10.0 + ".\n\n"
        + y + "rounded to the nearest hundreth is " + Math.round(y * 100) / 100.0 + ".\n"
        + "5.91 rounded to the nearest hundreth is " + Math.round(5.91 * 100) / 100.0 + ".\n"
        + "3.14 rounded to the nearest hundreth is " + Math.round(3.14 * 100) / 100.0 + ".\n"
        + "3.566667 rounded to the nearest hundreth is " + Math.round(3.566667 * 100) / 100.0 + ".\n\n"
        + "pi times 21 is " + Math.PI * 21.0 + ".\n"
        );
    }

}
