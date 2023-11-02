
/**
 * @author Trevor Zellmer
 */
public class Client{
    final int seasonWeeks = 22;
    private String name;
    private int lawnLength;
    private int lawnWidth;
    private int paymentQuantity;
    private double seasonCharge;
    private double serviceCharge;
    private double clientCost;

/**
 * @param newName
 */
public void setName(String newName){
    name = newName;
}

/**
 * @param newLawnWidth
 */
public void setLawnWidth(int newLawnWidth){
    lawnWidth = newLawnWidth;
}
/**
 * @param newLawnLength
 */
public void setLawnLength(int newLawnLength){
    lawnLength = newLawnLength;
}
/**
 * @param newPaymentQuantity
 */
public void setPaymentQuantity(int newPaymentQuantity){
    paymentQuantity = newPaymentQuantity;
}
//getters
/**
 * @return name
 */
public String getName(){
    return name;
}
/**
 * @return lawnWidth
 */
public int getLawnWidth(){
    return lawnWidth;
}
/**
 * @return lawnLength
 */
public int getLawnLength(){
    return lawnLength;
}
/**
 * @return paymentQuantity
 */
public int getPaymentQuantity(){
    return paymentQuantity;
}
/**
 * @return seasonCharge
 */
public double getSeasonCharge(){
    return seasonCharge;
}
/**
 * @return serviceCharge
 */
public double getServiceCharge(){
    return serviceCharge;
}
/**
 * @return clientCost
 */
public double getClientCost(){
    return clientCost;
}

public void chargeCalculation(){
    //Season Charge
    int squareYards = lawnLength * lawnWidth;
    if (squareYards >= 800){
            seasonCharge = 50 * paymentQuantity;
    } else if (squareYards >= 500){
            seasonCharge = 35 * paymentQuantity;
    } else if  (squareYards < 500){
            seasonCharge = 25 * paymentQuantity;
    }
    //Service Charge
    switch (paymentQuantity){
        case 1: serviceCharge = 0;
            break;
        case 2: serviceCharge = paymentQuantity * 5;
            break;
        case seasonWeeks: serviceCharge = paymentQuantity * 3;
            break;
    }
    //Total client chrage
    clientCost = (double) seasonCharge + serviceCharge;
}
}