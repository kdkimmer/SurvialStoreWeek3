package SurvivalStore;

/**
 * Created by kim on 7/2/2015.
 */
public class User {

    private Wallet wallet;

    public User() {
        this.wallet = new Wallet();
    }
    /* ToDo seeWallet, seeCart, remove(Product object), purchase(Product object), addToCart(Product object)
    * purchase() will also have subtract(), addToCart() will also have addItems()*/

    // wallet
    // cart is an empty list of products

    // default constructor to set up wallet and cart

    public Wallet getWallet() {
        return this.wallet;
    }
}
