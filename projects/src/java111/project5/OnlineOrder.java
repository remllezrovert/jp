package java111.project5;
/** @author Trevor Zellmer */
public class OnlineOrder extends Order {
    private Boolean isShipped;
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
   /** @return shippingCharge */
   double shippingCharge(){
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
    return super.calculate() + shippingCharge();
   }

   public String toString(){
    return super.toString()
    + "Plus a $" + shippingCharge() + " shipping charge\n"
    + "Grand Total: $" + calculate() + "\n";
   }
}
