package java111.project5;
/** @author Trevor Zellmer */
public class OrderTestDrive {

    public static void main(String[] args){
        OrderProcessing op = new OrderProcessing();
        op.populateList();
        System.out.println(op.displayList());
    }
}
