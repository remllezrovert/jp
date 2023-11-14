
//* @author Trevor Zellmer*/
import java.util.ArrayList;
public class BankAccountTestDrive{


    public static void main(String[] args){
        ArrayList<BankAccount> bl1 = new ArrayList<BankAccount>();
       
        
        CheckingAccount c1 = new CheckingAccount();
        c1.setBalence(100000.0);
        bl1.add(c1);

       AutoLoan a1 = new AutoLoan();
        a1.setBalence(5000.0);
        bl1.add(a1);


        bl1.forEach(
        i -> {
            System.out.println(i.getType() + " has a balence of $" + String.format("%,.2f", i.getBalence()) + ".");
            i.creditAccount(1000.0);
            }
        );
        System.out.println("\n" + "Crediting accounts $1000....");


        bl1.forEach(
        i -> {
            System.out.println(i.getType() + " has a balence of $" + String.format("%,.2f", i.getBalence()) + ".");
            i.creditAccount(500);
            }
        );
        System.out.println("\n" + "Debiting accounts $500....");

        bl1.forEach(
        i -> {
            System.out.println(i.getType() + " has a balence of $" + String.format("%,.2f", i.getBalence()) + ".");
            }
        );

    }
 
}