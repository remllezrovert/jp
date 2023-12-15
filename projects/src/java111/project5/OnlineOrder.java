package java111.project5;

/**   
 *  This class is for an online order
 *  this class subclasses Order
 *  It differs from order because it has a shipping variable
 * Each OnlineOrder contains one user, and one product type
 * @author Trevor Zellmer 
 */



public class OnlineOrder extends Order {
    private Boolean isShipped;
    /** This is the constructor  for the OnlineOrder clas
     * @param customerName - The full name of the customer.
     * @param customerNumber - Arbitrary id for customer.
     * @param productName - The name of the product.
     * @param productQuantity - The quantity of proucts purchaced in the order.
     * @param productPrice - The price of a single product in the order.
     * @param isShipped - If product is shipped, a charge will be applied.
     */
    OnlineOrder(
     String customerName, 
     int customerNumber, 
     String productName, 
     int productQuantity,
     double productPrice,
     Boolean isShipped
   ){
    super(
     customerName, 
     customerNumber, 
     productName, 
     productQuantity,
     productPrice
    );
    this.isShipped = isShipped;
   } 
   /** 
    * @return shippingCharge 
    */
   double shippingCharge(){
    if (isShipped == false)
        return 0.0;
    if (productQuantity >= 10){
        return 7.0;
    }else if(productQuantity >= 7){
        return 6.0;
    }else if(productQuantity >= 4){
        return 3.0;
    }else if(productQuantity >= 1){
        return 1.50;
    }else {System.out.println("Error"); return 0.0;}
   }
   /** @return grandTotal - totalCost + shippingCharge */
   double calculate(){
        if (isShipped)
            return super.calculate() + shippingCharge();
        else
            return super.calculate();
   }
   /** This method creates a short string summarizing order cost
    *  @return printString - A short summary showing the charge */
   public String toString(){
    return super.toString()
    + "Plus a $" + shippingCharge() + " shipping charge\n"
    + "Grand Total: $" + calculate() + "\n";
   }
}
