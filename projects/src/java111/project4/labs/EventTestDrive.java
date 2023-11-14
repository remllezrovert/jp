import java.util.ArrayList;
public class EventTestDrive{
public static void main(String[] args){
    ArrayList<Event> eventList1 = new ArrayList<Event>();
    Meeting meeting = new Meeting();
    eventList1.add(meeting);
    Marathon marathon = new Marathon();
    eventList1.add(marathon);
    System.out.println("Here are all of my events: " + "\n");
    eventList1.forEach((e) -> e.display());
    //Event e = new Event(); //this won't compile because event is abstract.

}

}