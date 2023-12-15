package java111.project5;

/** This is a menu allowing users to select their pizza size.
 * @author Trevor Zellmer 
 */
public class SelectPizza {
 /** This prints all of the pizza sizes and prompts the user to choose one.
 * It prints out which pizza the user has selected.
 *  @throws Exception - Invalid user input or input out of bounds
 */
    public void processSelection()
        throws Exception {
        char selection;
        String choice = "";
        int index = 0;

        System.out.print("Select a pizza size "
                 + "(Type 1 for S, 2 for M, 3 for L, 4 for X): ");

        selection = (char) System.in.read();
        choice = choice + selection;
        index = Integer.parseInt(choice) - 1;

        PizzaChoice thisChoice  = new PizzaChoice(index);

        System.out.println(thisChoice);
    }

}
