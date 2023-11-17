package _231114_overload;

public class Tester {
    public static void main(String[] args) {
        Book book = new Book("Einhoerner leben laenger", "Erst Lustig", "3453453845");
        book.setPrice(23.6f);
        System.out.println(book);

        Book otherBook = new Book("Frieden#Hunderwasser#09984646");
        otherBook.setPrice(15, 90);
        System.out.println(otherBook);
        otherBook.setPrice("56.98");
        System.out.println(otherBook);

        // your turn: fix the comma problem without exception handling
        otherBook.setPrice("56,98");
        System.out.println(otherBook);

        // your turn: Each book should have a price which ends to ,90. E.g.: if
        // the price is 56,98 replace this price by 56,90.
    }
}
