

public class Employee{

    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }


    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;

    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(int newEmployeeID){
        this.employeeID = newEmployeeID;

    }




    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;

    }



    public void display(){
        System.out.print(firstName + " " + lastName + " has employee id number " + employeeID + ", and earns $");
        System.out.printf("%.2f", salary);
        System.out.println(" per year.");

    }




}