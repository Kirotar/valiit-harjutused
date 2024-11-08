package dayfive;

public class Book {
    //Attributes, fields:
    String title;
    String author;
    int yearPublished;

    //cconstructor name must match the class name, and it cannot have a return type (like void).
    public Book() {
        title = "Unknown";
        author = "Unknown";
        yearPublished = 1900;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title; //if I don't have something to add to the string I can add null myself.
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public static void main(String[] args) {
        Book Book1 = new Book();
        Book Book2 = new Book("Memoirs", "John", 2020);
        Book Book3 = new Book();
        Book Book4 = new Book("Childrens book", "Peter", 2001);
        Book1.bookData();
        Book2.bookData();
        Book3.bookData();
        Book4.bookData();
        /*System.out.println("Book title: " + Book1.title + ". Book author: " + Book1.author + ". Year published:  " + Book1.yearPublished);
        System.out.println("Book title: " + Book2.title + ". Book author: " + Book2.author + ". Year published:  " + Book2.yearPublished);
        System.out.println("Book title: " + Book3.title + ". Book author: " + Book3.author + ". Year published:  " + Book3.yearPublished);
        System.out.println("Book title: " + Book4.title + ". Book author: " + Book4.author + ". Year published:  " + Book4.yearPublished);
*/
    }

    public void bookData() { //a static method cannot directly access instance variables or instance methods of the
        // class because static methods belong to the class itself, not to any specific object (or instance) of the class.
        System.out.println("Book title: " + title + ". Book author: " + author + ". Year published:  " + yearPublished);
    }
}

