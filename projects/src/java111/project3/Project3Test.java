import java.util.Base64.Decoder;

public class Project3Test{
    public static void main(String[] args){
       
        
        /* How much should I test?
         *  Should I test negative values?
         * Should I keep paymentQuantity <= 22
         * How should I handle null values?
         * 
         */
    Summary s1 = new Summary();
    Client hank = s1.clientCreator("Hank hill", 20, 30, 22);
    Client john = s1.clientCreator("John Deer", 99, 99, 2);
    Client phil = s1.clientCreator("Punxsutawney Phil", 2, 3, 1);
    Client aquaman = s1.clientCreator("Aquaman", 0, 0, 2);
   
   
System.out.println( (hank.getClientCost() == 836.0) ? "22 week test passed " : "22 week test failed");
System.out.println((john.getClientCost() == 110.0) ? "2 week test passed ": "2 week test failed");
System.out.println((phil.getClientCost() == 25.0) ? "1 week test passed" : "1 week test failed");
System.out.println((aquaman.getLawnLength() == 0) ? "Lawnless test passed " : "Lawnless test failed");
System.out.println((s1.getTotalSquareYards() == 10407) ? "total square yards test passed" : "total square yards test failed");
System.out.println((s1.getRevenue() == 1031.0) ? "revenue test passed" : "revenue test failed");
   //s1.display(); 

    }
}