/*
 * Design a class Library that contains a list of Book objects.
 * Implement methods to add, remove, and search books by title.
 */

package Q14;

import java.util.ArrayList;
import java.util.List;

class Book 
{
    private String title;
    private String author;

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() 
    {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               '}';
    }
}


class Library 
{
    private List<Book> books;

    public Library() 
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book) 
    {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchBookByTitle(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                return book;
            }
        }
        return null;
    }
}
public class Library_Book 
{
    public static void main(String[] args) 
    {
        Library library = new Library();

        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);

        Book foundBook = library.searchBookByTitle("1984");
        if (foundBook != null) 
        {
            System.out.println("Found: " + foundBook);
        } 
        else 
        {
            System.out.println("Book not found");
        }

        library.removeBook(book1);
        // Verify removal:
        if (library.searchBookByTitle("The Alchemist") == null) 
        {
            System.out.println("‘The Alchemist’ was successfully removed.");
        }
    }
}
