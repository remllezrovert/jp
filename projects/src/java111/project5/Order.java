package java111.project5;

/** This class is for the 'Order' superclass.
 * An order contains customer information
 * and information for a single product type
 * aswell as a quantity of products.
 * Orders in this class are NOT shipped
 *  unless they are in the 'OnlineOrder' subclass.
 * @author Trevor Zellmer
 */ 
public class Order {
    protected String customerName; 
    protected int customerNumber;
    protected String productName;
    protected int productQuantity;
    protected double productPrice; 
    /** Constructor for the Order class
     * @param customerName - The full name of the customer.
     * @param customerNumber - Abstract id of customer
     * @param productName - The name of the product on order.
     * @param productQuantity - The number of proucts to ordre.
     * @param productPrice - The price of the product being ordered.
     */
    Order (
    String customerName, 
    int customerNumber, 
    String productName, 
    int productQuantity,
    double productPrice 
    ) {
    this.customerName = customerName;
    this.customerNumber = customerNumber;
    this.productName = productName;
    this.productQuantity = productQuantity;
    this.productPrice = productPrice;
    }

    /** This method calculates the cost of the order.
     * @return orderCost 
     */
    double calculate(){
        return (double) productQuantity * productPrice;
    }
   /** This method creates a short string summarizing order cost
    *  @return printString - A short summary showing the charge */
    public String toString(){
        return "Cusomer: " + customerName + "\n"
        + "Item Ordered: " + productName + "\n"
        + "Unit Price: $" + productPrice + "\n"
        + "Quantity Ordered: " + productQuantity + "\n"
        + "Total: $" + calculate() + "\n";
    }



}