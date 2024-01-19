package _240119_onlineShop;

public class Article {
    private int articleNumber;
    private float price;

    public Article(int articleNumber, float price){
        this.articleNumber = articleNumber;
        this.price = price;
    }

    public float getPrice(){

        System.out.println("DEBUG> in Article.getPrice");
        return price;
    }

}
