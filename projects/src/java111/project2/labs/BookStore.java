/** This class represents a bookstore.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author //Trevor Zellmer
 */

public class BookStore {

    private Book[] bookArray;
    private double bookArraySize;


    //This is a setter for the book arrray
    public void setBookArray(Book[] newBookArray){
      bookArray = newBookArray;
    }


    //This method returns the total distance that the books in the array take up
    public double bookArrayDistance(){
      for (int i = 0; i < bookArray.length; i++){
        bookArray[i].display();
        bookArraySize += bookArray[i].calculateTotalSize();
      }
      return bookArraySize;

    }




      //This method prints out all of the books in the array and their total size
    public void bookArrayPrint(){
      for (int i = 0; i < bookArray.length; i++){
        System.out.println(bookArray[i].display());
      }
      System.out.println("The total size is: " + bookArraySize);
    }

}
