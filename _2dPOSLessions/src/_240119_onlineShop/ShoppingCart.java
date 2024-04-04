package _240119_onlineShop;

public class ShoppingCart {
    private Article[] cart;

    public ShoppingCart(){
        cart = new Article[0]; // empty cart
    }

    public void addToCart(Article article){
        // create a temporary cart, which is one article larger
        Article[] tempCart = new Article[cart.length + 1];

        // copy all elements from cart to tempCart
        for(int i = 0; i < cart.length; ++i){
            tempCart[i] = cart[i];
        }
        tempCart[tempCart.length - 1] = article; // add new article to the end of array

        this.cart = tempCart;
    }

    public void showBill(){
        float sum = 0.0f;

        // step through all articles
        for(int i = 0; i < cart.length; ++i){
            Article article = cart[i];
            float price = article.getPrice();
            System.out.println(article + " " + String.format("%.2f Euro", price));
            sum += price;
        }
        System.out.println("---------------------");
        System.out.println(String.format("Sum %.2f", sum));
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(new Dvd(12, 4.6f, "ThisDeVauDe", "12:23:45", 2009));
        shoppingCart.addToCart(new Book(14, 12.7f, 2009, "TheBook", "SchreiberWars"));
        shoppingCart.showBill();
    }
}
