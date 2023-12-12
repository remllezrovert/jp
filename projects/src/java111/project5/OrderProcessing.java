package java111.project5;
import java.util.ArrayList;
/** @author Trevor Zellmer */

/** Creates a list of Orders, populates them, calls their methods. */
public class OrderProcessing {
    ArrayList<Order> arr = new ArrayList<Order>();

    /** Creates a list with one Order and one OnlineOrder object */
    void populateList(){
    Order o1 = new Order("Muhammad", 
        1, 
        "Widget",
        7,
        12.99);
    arr.add(o1);
    OnlineOrder oo1 = new OnlineOrder(
    "Hui yin", 
    2, 
    "Widget", 
    7, 
    12.99,
    true);
    arr.add(oo1);
    }

    /** Runs the calculate method on a Order object
     * @param order - an order object to calculate 
    */
    void run(Order order){
        order.calculate();
    }

    /** Loops through a lost of Orders calling their toString methods */
    /** @return orderList - A list of toString output from all orders */
    String displayList(){
        String ret = "";
        for(int i = 0; i < arr.size(); i++) {
         run(arr.get(i));
         ret += "\n" + arr.get(i).toString();
         }
        return ret;
    }

}
