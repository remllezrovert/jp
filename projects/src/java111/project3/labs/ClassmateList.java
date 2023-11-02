
import java.util.*;


public class ClassmateList{

    List<String> arr;
    public void run(){
    arr = new ArrayList<String>();
        arr.add("Jim Jones"); 
       arr.add("CoolAid Man"); 
       arr.add("Jeus Christ"); 
       arr.add("George W"); 
        System.out.println("Using System.out.println to display the students: " + "\n" + arr + "\n");
        System.out.println("Using a for loop to display the students: ");
        arr.forEach(((n) -> System.out.println(n)));
        //Used oracle documentation and instructor help here
        arr.remove(2);
        System.out.println("\n" + "Using System.out.println to display the students after removing one student: " + "\n" + arr);
    
    }



}
