
/** @author Trevor Zellmer */
public class MessengerTestDrive {
public static void main (String[] args){
    Messenger m1 = new Messenger();
    System.out.println(m1.messenger());
    SpanishMessenger s1 = new SpanishMessenger();
    System.out.println(s1.messenger());
    }
}