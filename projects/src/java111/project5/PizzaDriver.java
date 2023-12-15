package java111.project5;
/**
 * Creates a pizza and calls it's process method
 *  @author Trevor Zellmer 
 */
public class PizzaDriver {
    /**  If a pizza does not exist, create one, and process it
     * @throws Exception - Handles exceptions from SelectPizza
     * @param args - Args for main method.
     */
    public static void main(String[] args)
            throws Exception {
        SelectPizza  thisPizza  = new SelectPizza();
        thisPizza.processSelection();
    }
}
