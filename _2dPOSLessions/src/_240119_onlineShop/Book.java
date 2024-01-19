package _240119_onlineShop;

public class Book extends Article {

    private int year;
    private String author;
    private String title;

    public static final float VAT = 0.05f;

    public Book(int articleNumber, float price, int year, String author, String title) {
        super(articleNumber, price);
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public float getPrice(){
        System.out.println("DEBUG> in Book.getPrice");
        return super.getPrice() * (1 + VAT);
    }

    @Override
    public String toString() {
        return "Book :" + title + " from author" + author + " (" + year + ")";
    }

    public static void main(String[] args) {
        Book b = new Book(12, 10.0f, 2023, "SC", "POS Best of");
        System.out.println(b.getPrice());
    }
}
