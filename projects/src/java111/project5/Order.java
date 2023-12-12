package java111.project5;
/** @author Trevor Zellmer*/ 

public class Order {
    protected String customerName; 
    protected int customerNumber;
    protected String productName;
    protected int productQuantity;
    protected double productPrice; 

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

    /** @return orderCost */
    double calculate(){
        return (double) productQuantity * productPrice;
    }
    /** @return orderSummary - Information about the order*/
    public String toString(){
        return "Cusomer: " + customerName + "\n"
        + "Item Ordered: " + productName + "\n"
        + "Unit Price: $" + productPrice + "\n"
        + "Quantity Ordered: " + productQuantity + "\n"
        + "Total: $" + calculate() + "\n";
    }



}