import java.util.*;

public class EmployeeList{

    List<Employee> arr;
    public void run(){
        arr = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.setFirstName("Elizibeth");
        e1.setLastName("Holmes");
        e1.setEmployeeId(1);
        arr.add(e1);

        Employee e2 = new Employee();
        e2.setFirstName("Charles");
        e2.setLastName("Ponzi");
        e2.setEmployeeId(2);
        arr.add(e2);

        Employee e3 = new Employee();
        e3.setFirstName("Martin");
        e3.setLastName("Shkereli");
        e3.setEmployeeId(3);
        arr.add(e3);

        Employee e4 = new Employee();
        e4.setFirstName("Bernie");
        e4.setLastName("Madhoff");
        e4.setEmployeeId(4);
        arr.add(e4);

        System.out.println("Here are the Employees in the list:" + "\n ");
        arr.forEach((n) -> System.out.println(n.displayEmployee()));

    }
}
