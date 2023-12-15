package java111.project5;
/**  This is a short unit test for the Order and OnlineOrder class
 * @author Trevor Zellmer 
 */
public class OrderTestDrive {
    /**
     *  This method creates an OrderProcessing object
     * then adds an OnlineOrder and an Order to it's ArrayList.
     * Then it prints all of the toString methods for these objects.
     * @param args - Args for the main method.
     */
    public static void main(String[] args){
        OrderProcessing op = new OrderProcessing();
        op.populateList();

        System.out.println(op.displayList());

        if (op.displayList().equals(
            "\nCusomer: Muhammad\n" +
            "Item Ordered: Widget\n" +
            "Unit Price: $12.99\n" +
            "Quantity Ordered: 7\n" +
            "Total: $90.93\n\n" +
            "Cusomer: Hui yin\n"+
            "Item Ordered: Widget\n"+
            "Unit Price: $12.99\n"+
            "Quantity Ordered: 7\n"+
            "Total: $96.93\n"+
            "Plus a $6.0 shipping charge\n"+
            "Grand Total: $96.93\n"
            )
        ) {
            System.out.println( "unit test passed");
         } else{ System.out.println("unit test failed");
        }

    }


}
