
//Author Trevor Zellmer
public class Invoice{

    Item[] itemArray;
    double invoiceTotal;

//Getters and setters
    public double getInvoiceTotal(){
        return invoiceTotal;
    }

    public void setItemArray(Item[] newItemArray){
       itemArray = newItemArray; 
    }

    //find the total price of all item objects in the array
    public void calculateInvoice(){
        for (int i = 0; i < itemArray.length; i++){
            invoiceTotal += itemArray[i].getItemPrice();
        }

        }

    //run the display method of each item object in the array
    public void displayInvoice(){

        for (int i = 0; i < itemArray.length; i++){
            System.out.println(itemArray[i].display());
        }
        System.out.print("\n" +"Invoice Total: ");
        System.out.printf("%.2f", invoiceTotal);
        System.out.print("\n");
    }
}