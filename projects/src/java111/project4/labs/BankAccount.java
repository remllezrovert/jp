

public abstract class BankAccount{
public double balence;
public String type;
public abstract String getType();
public abstract double getBalence();
public abstract void setBalence(double newBalence);
public abstract void debitAccount(double debitAmount);
public abstract void creditAccount(double creditAmount);


}