package com.stock;
import java.util.HashMap;
import java.util.Map;

public class User implements Tradable {
    private String name;
    private double balance;
    private Map<String, Integer> portfolio = new HashMap<>();

    public User(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    @Override
    public void buy(int qty, double price) {
        double cost = qty * price;
        if (balance >= cost) {
            balance -= cost;
            portfolio.put("Tech", portfolio.getOrDefault("Tech", 0) + qty);
            System.out.println("✅ Bought " + qty + " shares.");
        } else {
            System.out.println("❌ Insufficient funds.");
        }
    }

    @Override public void sell(int qty, double price) { /* Future logic */ }

    public void displayStatus() {
        System.out.printf("User: %s | Balance: $%.2f | Portfolio: %s\n", name, balance, portfolio);
    }
}