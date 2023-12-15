package java111.project5;
import java.text.*;
import java.util.*;

/**  A collection of pizzas with sizes and prices
 * view pizza sizes, and view pizza prices
 * @author Trevor Zellmer 
 */
public class PizzaChoice {
    private  char[] sizes = {'S', 'M', 'L', 'X'};
    private  double[] prices = {6.99, 8.99, 12.50, 15.00};
    private  NumberFormat formatter  = NumberFormat.getCurrencyInstance();
    private  int index;
   
    /** This method allows the user to select a pizza in the pizza array
     * @param choice - The index of the chosen pizza on the pizza array
     */
    public PizzaChoice(int choice) {
        index = choice;
    }
    /** This method allows the user to get the size of a pizza in the array.
     * @return size - The size of the pizza. 
     */
    public char getSize() {
        return sizes[index];
    }
    /** This method allows the user to get the price of a pizza in the array.
     * @return price - The price of the piza. 
     */
    public double getPrice() {
        return prices[index];
    }
    /**  This method returns a string with infromation about a pizza.
     * @return String - A formated string containing the price of the pizza.
     */
    public String toString() {
        return "The price is " + formatter.format(prices[index]);
    }
}
