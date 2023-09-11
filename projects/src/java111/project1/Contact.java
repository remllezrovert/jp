
public class Contact{
	String firstName;

	String lastName;

	String address;

	String phoneNumber;

	String emailAddress;
	
	public void display(String firstName, String lastName, String address, String phoneNumber, String emailAddress){
		
		System.out.println("Name: " + firstName + ", " + lastName);	
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("Email: " + emailAddress);
	}	

}

