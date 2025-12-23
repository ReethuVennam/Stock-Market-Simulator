package com.stock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Market
        List<Stock> market = new ArrayList<>();
        market.add(new TechStock("NVDA", "Nvidia", 500.0));
        market.add(new TechStock("AAPL", "Apple", 180.0));

        // 2. Initialize User
        User myUser = new User("John Doe", 10000.0);

        System.out.println("--- Welcome to the Mini Stock Simulator ---");

        // 3. Simulate 5 Days of Market Movement
        for (int day = 1; day <= 5; day++) {
            System.out.println("\nDay " + day + " Market Update:");
            
            for (Stock s : market) {
                s.updatePrice(); // Polymorphism in action
                System.out.printf("%s: $%.2f\n", s.getTicker(), s.getCurrentPrice());
            }

            // Simple Logic: Buy 2 shares of the first stock on Day 1
            if (day == 1) {
                myUser.addStockToPortfolio(market.get(0).getTicker(), 2, market.get(0).getCurrentPrice());
            }
        }

        // 4. Show Final Results
        myUser.showPortfolio();
    }
}