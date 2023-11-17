package _231114_overload;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private float price;

    public Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    // this is an overloaded Constructor
    // Title#Author#ISBN
    public Book(String allInformations){
        // your turn: Init the instancevariabes
        String[] tokens = allInformations.split("#");
        this.title = tokens[0];
        this.author = tokens[1];
        this.isbn = tokens[2];
    }

    // your turn: implement two methods to set the price
    public void setPrice(float price){
        int value = (int)price;
        this.price = value + .90f;
    }

    public void setPrice(int priceEuro, int priceCent){
        //this.price = priceEuro + priceCent/100.0f;
        setPrice(priceEuro + priceCent/100.0f);
    }

    public void setPrice(int price){
        setPrice(price * 1.0f);
    }

    public void setPrice(String price){
        if(price.contains(",")){
            price = price.replace(",", ".");
        }
        float priceFloat = Float.parseFloat(price);
        setPrice(priceFloat);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + this.title + "\n");
        sb.append("Author: " + this.author + "\n");
        sb.append("ISBN: " + this.isbn + "\n");
        sb.append(String.format("PRICE: %.2f\n", this.price));
        return sb.toString();
    }
}
