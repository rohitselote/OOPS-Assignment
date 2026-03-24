class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("The Alchemist", "Paulo Coelho", 299.0);
        books[1] = new Book("Harry Potter", "J.K. Rowling", 499.0);
        books[2] = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.0);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
