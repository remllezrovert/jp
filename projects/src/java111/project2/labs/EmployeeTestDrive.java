

public class EmployeeTestDrive{

    public static void main(String[] args){
        
        Employee employee1 = new Employee();
        employee1.setFirstName("Trevor");
        employee1.setLastName("Zellmer");
        employee1.setSalary(120.00);
        employee1.setEmployeeID(3);
        employee1.display();

        Employee employee2 = new Employee();
        employee2.setFirstName("Paula");
        employee2.setLastName("Waite");
        employee2.setSalary(7.00);
        employee2.setEmployeeID(2);
        employee2.display();

        Employee employee3 = new Employee();
        employee3.setFirstName("Leroy");
        employee3.setLastName("Jenkins");
        employee3.setSalary(9999999.99);
        employee3.setEmployeeID(1);
        employee3.display();
    }
}