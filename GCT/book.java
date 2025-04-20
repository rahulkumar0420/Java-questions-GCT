class Book {
    String title, author, isbn;
    static int totalBooks = 0;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    void borrowBook() {
        System.out.println(title + " has been borrowed.");
    }

    void returnBook() {
        System.out.println(title + " has been returned.");
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe", "1234");
        Book b2 = new Book("OOP Concepts", "Jane Smith", "5678");

        b1.borrowBook();
        b2.returnBook();

        System.out.println("Total books: " + Book.getTotalBooks());
    }
}
