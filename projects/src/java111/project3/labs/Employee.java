
public class Employee{


    private String firstName;
    private String lastName;
    private int employeeId;


    //getter block
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    //setter block
    public void setFirstName(String newFirstName){
       firstName = newFirstName; 
    }
    public void setLastName(String newLastName){
       lastName = newLastName; 
    }
    public void setEmployeeId(int newEmployeeId){
        employeeId = newEmployeeId;
    }

    public String displayEmployee(){
        return "Employee " + firstName + " " + lastName + " has an id of " + employeeId;
    }
}