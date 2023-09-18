
public class Item{
    private int itemID;
    private int itemNumber;
    private double itemPrice;
    private String itemDescription;

    //Setters

    public void setItemID(int newItemID){
        itemID = newItemID;
    }

    public void setItemNumber(int newItemNumber){
        itemNumber = newItemNumber;
    }

    public void setItemPrice(double newItemPrice){
        itemPrice = newItemPrice;
    }
    public void setItemDescription(String newItemDescription){
        itemDescription = newItemDescription;
    }


    //Getters
    public int getItemID(){
        return itemID;
    }
    public int getItemNumber(){
        return itemNumber;
    }
    public double getItemPrice(){
        return itemPrice;
    }
    public String getItemDescription(){
        return itemDescription;
    }


    //This method calculates the total cost of a single set of one specific item and returns a double.
    public double calculateItemTotal(){
        double totalPrice = (double) itemNumber * itemPrice;
        return totalPrice;
    }

    //This method returns a string which will be used to display output
    public String display(){
        return "Item ID: " + itemID + ", Quantity: " + itemNumber + ", Price: $" + String.format("%,.2f", itemPrice) + ", Description: " + itemDescription;

    }
}