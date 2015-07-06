package SurvivalStore;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/**
 * Created by kim on 7/2/2015.
 */

//using public so that other classes can access Product
public class Product {


    //instance variables because we used private it can only be accessed by this class
    //private int ID;
    private String name;
    private String category;
    private double price;
    private int quantity;

    //the constructor which creates an instance of the Product class
    public Product(){}

    public Product(String name, String category, double price, int quantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity(String itemComponent) {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Product: " +
                "Name: " + this.name  +
                "Category: " + this.category +
                "Price: " + df.format(this.price) +
                "Quantity: " + this.quantity + "\n";
    }
}
