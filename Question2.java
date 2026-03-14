// 2.Design a Book class (title, author, ISBN) and a Library class that manages a 
// collection (e.g., an ArrayList) of Book objects. Implement methods in Library to 
// add a new book, remove a book by ISBN, and display all available books. 

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed with ISBN: " + isbn);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in library.");
            return;
        }

        System.out.println("Books in Library:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Data Structures", "Mark Allen", "102");
        Book b3 = new Book("Operating Systems", "Silberschatz", "103");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.displayBooks();

        library.removeBook("102");

        library.displayBooks();
    }
}
