
class Book {
    int bookID;
    String title;
    String author;
    double price;

    static int count = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;

        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }    
 
    void search(int id) {
        if (bookID == id)
            System.out.println("Book found: " + title);
        else
            System.out.println("Book not found");
    }

    void search(String t) {
        if (title.equalsIgnoreCase(t))
            System.out.println("Book found: " + title);
        else
            System.out.println("Book not found");
    }

    Book costlier(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }
}

class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java", "James Gosling", 500);
        Book b2 = new Book(102, "Python", "Guido", 700);
        Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 400);

        System.out.println("--- Book Details ---");
        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        b3.display();

        System.out.println("\n--- Search by Book ID ---");
        b1.search(101);

        System.out.println("\n--- Search by Title ---");
        b2.search("Python");

        System.out.println("\n--- Costlier Book ---");
        Book result = b1.costlier(b2);
        result.display();

        System.out.println("\nTotal Books Created: " + Book.count);

        System.out.println("\nName: Kriti Basavaraj Halgali");
        System.out.println("USN: 1WN25CS113");
    }
}
