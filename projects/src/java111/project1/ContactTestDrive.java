

public class ContactTestDrive{
    public static void main(String[] args){
        Contact bill = new Contact();
        bill.display("Bill", "Griefer","Issaquah, WA 98027", "1+401-867-5309",  "griefer@bromail.su");
        System.out.println("");
        Contact terry = new Contact();
        terry.display("Terry", "Davis","White Sands, NM 88002", "1+800-304-3213",  "terryadavis@nasa.gov");
    }
}