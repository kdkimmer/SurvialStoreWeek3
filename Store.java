package SurvivalStore;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kim on 7/2/2015.
 */
public class Store {

    List<Product> inventory = new ArrayList<Product>();
    User user;

    public Store(){
        inventory = CsvReader.readInventory();
        this.user  = new User();
    }

    public static void main(String[] args){
        System.out.println("Loading");
        Store store = new Store();
        DecimalFormat df = new DecimalFormat("#0.00");
        printMain();
        String in = input();
        switch (in) {
            case "1":
                //do something
                System.out.println(store.inventory.toString());
                break;
            case "2":
                //do something else
                break;
            case "3":
                break;
            case "4":
                System.out.println("Wallet Balance: "+ df.format(store.user.getWallet().getBalance()));
                printMain();
                break;
            case "5":
                printMain();
                break;
            default:
                System.out.println("Wrong input");
                //back to main menu
                printMain();
                break;
        }
    }

    private static void printMain() {
        System.out.println("Welcome to Kim's Survival Store!");
        System.out.println("Please see the list below and chose an option.");
        /* ToDo  new arraylist for products and users, printList(), sort() using name(), category(), price()*/
        System.out.println("1 - See all Products\n " +
                "2 - See Products by Category\n " +
                "3 - View Shopping Cart\n " +
                "4 - View Wallet\n" +
                "5 - Back to Main (Exit)");
        System.out.println("Enter Option:  ");
    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        return userInput;
    }
}
