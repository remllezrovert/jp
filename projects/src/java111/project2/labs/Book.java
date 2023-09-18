/** Represents a book.
 *  Used emphasize Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author // Trevor Zellmer
 */
public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;
    private double size;




//block of getters
    public int getPublicationYear(){
        return publicationYear;
    }

    public int getNumberOfCopies(){
        return numberOfCopies;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public double getSize(){
        return size;
    }


//block of setters
    public void setTitle(String newTitle){
        title = newTitle;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void setPublicationYear(int newPulicationYear){
        publicationYear = newPulicationYear;
    }

    public void setNumberOfCopies(int newNumberOfCopies){
        numberOfCopies = newNumberOfCopies;
    }

    public void setSize(double newSize){
        size = newSize;
    }

// This method calculates total size of a book array and returns it
    public double calculateTotalSize(){
        double totalSize = size * numberOfCopies;
        return totalSize;
    }
     
//This method returns book information
    public String display(){
        String displayString = "Title: " + title + "\n Author: " + author + "\n Year published:  " + publicationYear + "\n Number of Copies: " + numberOfCopies + "\n Book Size: " + size;
        return displayString;
    }

}
