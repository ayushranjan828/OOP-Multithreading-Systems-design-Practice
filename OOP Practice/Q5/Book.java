/*
 * Create a class Book with properties title, author, and price. Include constructor overloading.
 */
package Q5;

public class Book 
{
    public String title;    
    public String author;
    public double price;

    Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
        this.price = 0.0; // Default price
    }

    Book(String title) 
    {
        this.title = title;
        this.author = "Unknown"; // Default author
        this.price = 0.0; // Default price
    }

    public String displayInfo() 
    {
        return "Book Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

    public static void main(String[] args) 
    {
        Book book1 = new Book("1984", "George Orwell", 15.99);
        System.out.println(book1.displayInfo());

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        System.out.println(book2.displayInfo());

        Book book3 = new Book("The Great Gatsby");
        System.out.println(book3.displayInfo());
    }
}
