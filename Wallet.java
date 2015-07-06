package SurvivalStore;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by kim on 7/2/2015.
 */
public class Wallet {
    private double balance;

    public Wallet() {
        this.balance = 3500 + Math.round(100 * (Math.random() * 6500)) / 100.00;
    }

    /*
    ToDo printWallet(), subtract(), add()
    */
    public double getBalance(){
        return this.balance;
    }
}
