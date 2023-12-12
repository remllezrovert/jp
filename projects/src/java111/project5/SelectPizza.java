package java111.project5;

/** @author Trevor Zellmer */
public class SelectPizza {

/** This is a menu allowing uses to select their pizza size */
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
