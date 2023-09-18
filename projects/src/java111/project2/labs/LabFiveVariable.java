

public class LabFiveVariable{
    private int count = 1;

    public void set(int newCount){
        count = newCount;
    }

    public int get(){
        return count;
    }

    public void run(){
        int count = 15;
        System.out.println("The local vaiable is: " + count);

        System.out.print("The instance varaible named count is: ");
        System.out.println(this.get() + " (Printed from the run() method)" );

        System.out.print("The instance varaible named count is: ");
        System.out.println(this.count + " (Printed from the alternative run() method)");

    }
}