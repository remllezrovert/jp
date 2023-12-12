package java111.project5;
import java.text.*;
import java.util.*;

/** @author Trevor Zellmer */
public class PizzaChoice {
    private  char[] sizes = {'S', 'M', 'L', 'X'};
    private  double[] prices = {6.99, 8.99, 12.50, 15.00};
    private  NumberFormat formatter  = NumberFormat.getCurrencyInstance();
    private  int index;
   
    /** @param choice - The index of the chosen pizza on the pizza list */
    public PizzaChoice(int choice) {
        index = choice;
    }
    /** @return size - The size of the pizza. */
    public char getSize() {
        return sizes[index];
    }
    /** @return price - The price of the piza. */
    public double getPrice() {
        return prices[index];
    }
    /** @return String - A formated string containing the price of the pizza.*/
    public String toString() {
        return "The price is " + formatter.format(prices[index]);
    }
}
