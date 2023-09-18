

//Author Trevor Zellmer

public class ProcessInvoice{
    public Invoice invoice1;

    //Instanciate items and populate their fields, add them to a local array
    private void createItems(){
        Item item1 = new Item();
        item1.setItemID(1);
        item1.setItemNumber(1);
        item1.setItemPrice(999.99);
        item1.setItemDescription("Retrodimensional phased array dowsing apparatus");

        Item item2 = new Item();
        item2.setItemID(2);
        item2.setItemNumber(100);
        item2.setItemPrice(2.34);
        item2.setItemDescription("XXL Freestyle Ghee Wand");

        Item item3 = new Item();
        item3.setItemID(3);
        item3.setItemNumber(13);
        item3.setItemPrice(91.23);
        item3.setItemDescription("Caustic Exhaust Bearings");


        Item item4 = new Item();
        item4.setItemID(4);
        item4.setItemNumber(7);
        item4.setItemPrice(9.37);
        item4.setItemDescription("High Octane Blinker fluid");

        Item[] myLocalArray;
        myLocalArray = new Item[]{item1,item2,item3,item4};

        invoice1.setItemArray(myLocalArray);
    }

    //Create a new invoice object, populate it's array, calculate and display it's total
    public void runProcess(){

        invoice1 = new Invoice();
        createItems();
        invoice1.calculateInvoice();
        invoice1.displayInvoice();
    }


}