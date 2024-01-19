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
}
