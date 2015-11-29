package com.customsite.helloworld;

/**
 * Created by julian.bishop on 11/29/15.
 */
public class Account {

    private int bal = 0;

    public Account(int balance) {
        bal = balance;
    }

    public int getBalance() {
        return bal;
    }

    public void addMoney(int amount) {
        bal += amount;
    }

    public void removeMoney(int amount) {
        bal -= amount;
    }
}
