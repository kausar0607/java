class Library {
    String libraryAddress = "Абай даңғылы, 10";

    // Ішкі класс
    class Book {
        void printTitle(String title) {
            System.out.println("Кітапхана мекенжайы: " + libraryAddress);
            System.out.println("Кітап атауы: " + title);
        }
    }
}

// Қолдану:
public class Main {
    public static void main(String[] args) {
        Library myLib = new Library();
        Library.Book myBook = myLib.new Book();
        myBook.printTitle("Java негіздері");
    }
}