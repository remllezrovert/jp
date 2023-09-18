/** This class creates a bookstore and then fills it with books.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author //Trevor Zellmer
 */

public class BookStoreBuilder {
    private BookStore myBookStore;
    private Book[] bookArray;


    //This method creates books and puts them into an array
    public void BookMaker(){
        Book b1 = new Book();
        b1.setAuthor("Idiot");
        b1.setTitle("Java for Idiots");
        b1.setNumberOfCopies(4);
        b1.setPublicationYear(2001);
        b1.setSize(22.3);

        Book b2 = new Book();
        b2.setAuthor("Hellen Keller");
        b2.setTitle("How to read (with pictures)");
        b2.setNumberOfCopies(555);
        b2.setPublicationYear(1992);
        b2.setSize(0.1);

        Book b3 = new Book();
        b3.setAuthor("Leo Tolstoy");
        b3.setTitle("War and Peace");
        b3.setNumberOfCopies(2);
        b3.setPublicationYear(1869);
        b3.setSize(10000);

        Book b4 = new Book();
        b4.setAuthor("Task Tools");
        b4.setTitle("Task T32310 3-2/3-inch by 25 Feet Aluminum Oxide Sandpaper Roll, 80 Grit");
        b4.setNumberOfCopies(1);
        b4.setPublicationYear(2013);
        b4.setSize(30);
        bookArray = new Book[]{b1,b2,b3,b4};
        myBookStore.setBookArray(bookArray);
    }


      //This method instanciates a new bookstore, assigns it an array of newly created books, and prints out information about the new book array.

      public void run(){
        myBookStore = new BookStore();
        BookMaker();
        myBookStore.bookArrayDistance();
        myBookStore.bookArrayPrint();
      }



}
