





public class EmployeeFactory{

    public Employee[] employees;

    public void setup(){
        Employee employee1 = new Employee();
        employee1.setFirstName("Trevor");
        employee1.setLastName("Zellmer");
        employee1.setSalary(120.00);
        employee1.setEmployeeID(3);

        Employee employee2 = new Employee();
        employee2.setFirstName("Paula");
        employee2.setLastName("Waite");
        employee2.setSalary(7.00);
        employee2.setEmployeeID(2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Leroy");
        employee3.setLastName("Jenkins");
        employee3.setSalary(9999999.99);
        employee3.setEmployeeID(1);

        employees = new Employee[]{employee1, employee2, employee3};

    }



    public void runWhile(){
        int loopCount = 0;
        System.out.println("\n" + "Displaying Employees using a while loop:" + "\n");
        while (loopCount < employees.length){

        employees[loopCount].display();
        loopCount += 1;

       } 
    }

    public void runFor(){

        System.out.println( "\n" + "Displaying Employees using a for loop:" + "\n");
        for (int i = 0; i < employees.length; i++){
            employees[i].display();
        }
    }

}
