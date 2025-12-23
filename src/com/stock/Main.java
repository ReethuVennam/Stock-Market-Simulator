package com.stock;

public class Main {
    public static void main(String[] args) {
        Stock apple = new TechStock("AAPL", 150.0);
        User player = new User("Trader1", 1000.0);

        System.out.println("--- Market Starting ---");
        for (int i = 1; i <= 3; i++) {
            apple.updatePrice();
            System.out.printf("Day %d: %s is $%.2f\n", i, apple.getTicker(), apple.getCurrentPrice());
        }

        player.buy(2, apple.getCurrentPrice());
        player.displayStatus();
    }
}