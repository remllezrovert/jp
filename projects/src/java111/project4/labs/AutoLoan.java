
//*@author Trevor Zellmer */
public class AutoLoan extends BankAccount{

    public String type = "Auto Loan";
    /** @returns type */
    public String getType(){
        return type;

    }
    public double getBalence(){
        return balence;

    }
    /**@param newBalence */
    public void setBalence(double newBalence){
       balence = newBalence; 

    }

    /**@param debitAmount */
    public void debitAccount(double debitAmount){
        balence += debitAmount;

    }

    /**@param creditAmount */
    public void creditAccount(double creditAmount){
        balence -= creditAmount;

    }
}
