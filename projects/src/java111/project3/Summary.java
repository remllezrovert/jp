import java.util.ArrayList;
/** @author Trevor Zellmer */
public class Summary {
final int seasonWeeks = 22;
private int totalSquareYards;
private double revenue;


private ArrayList<Client> customers = new ArrayList<Client>();

/**@return totalSquareYards */
public int getTotalSquareYards(){
    return totalSquareYards;
}
/**@return revenue */
public double getRevenue(){
    return revenue;
}
/**
 * @param client
 * @return boolean
 */
public boolean validate(Client client){
if (client.getLawnLength() < 0 || client.getLawnWidth() < 0) return false;
switch(client.getPaymentQuantity()){
    case 1: break;
    case 2: break;
    case seasonWeeks: break;
    default: return false;
}
return true;
}
/**
 * @param name
 * @param lawnLength
 * @param lawnWidth
 * @param paymentQuantity
 * @throws IllegalArgumentException
 * @returns Client
 */
public Client clientCreator(String name, int lawnLength, int lawnWidth, int paymentQuantity) throws IllegalArgumentException{
    Client client = new Client();
    client.setName(name);
    client.setLawnLength(lawnLength);
    client.setLawnWidth(lawnWidth);
    client.setPaymentQuantity(paymentQuantity);
    if (validate(client)){
        customers.add(client);
        client.chargeCalculation();
        revenue += client.getClientCost();
        totalSquareYards += client.getLawnLength() * client.getLawnWidth();
    } else {
        throw new IllegalArgumentException("Invalid Input");
    }
    return client;
}

public void input(){
    while (true) {
        InputHelper ih1 = new InputHelper();
    try{
        clientCreator(
            ih1.getUserInput("Enter client name:"),
            Integer.valueOf(ih1.getUserInput("Enter lawn length:")),
            Integer.valueOf(ih1.getUserInput("Enter lawn width:")),
            Integer.valueOf(ih1.getUserInput("Enter the number of payments:"))
        );
        if (!ih1.getUserInput("Enter another client? (y/n)").toLowerCase().equals("y")) {
        System.out.println("============ Client List ============");
        break;
        }
        System.out.println("-------------------------------------");
    } catch(Exception e) {
        System.out.println("----------- Invalid Input  ----------");
        continue;
    }
    }
}

public void display(){
    //display each client's information
    customers.forEach((client ) -> {
        System.out.println(
        "Name: " + client.getName() + "\n" +
        "Lawn Size: " + client.getLawnLength() * client.getLawnWidth() + "\n" +
        "Number of payments: " + client.getPaymentQuantity() + "\n" +
        "Ammount of each payment: $" + String.format("%,.2f", client.getSeasonCharge() / client.getPaymentQuantity()) + "\n" +
        "Total of all payments: $" +  String.format("%,.2f", client.getClientCost()) + "\n" +
        "====================================="
        );
    });

   //display the summary report 
    System.out.println(
        "########  Summary Report  ###########" + "\n" +
        "Number of clients:  " + customers.size() + "\n" +
        "Total revenue for the summer: $" + String.format("%,.2f", revenue) + "\n" +
        "Total square yards to mow : " + String.format("%,d", totalSquareYards)
    );
    }
}