//* @author Trevor Zellmer*/
public class CheckingAccount extends BankAccount{

    public String type = "Checking Account";
/** @returns type */
    public String getType(){
        return type;

    }
    /** @returns balence */
    public double getBalence(){
        return balence;

    }
    /** @param newBalence */
    public void setBalence(double newBalence){
       balence = newBalence; 

    }

    /** @param debitAmount */
    public void debitAccount(double debitAmount){
        balence -= debitAmount;

    }

    /** @param creditAmount */
    public void creditAccount(double creditAmount){
        balence += creditAmount;

    }
}