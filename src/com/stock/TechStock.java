package com.stock;

public class TechStock extends Stock {
    public TechStock(String ticker, double price) {
        super(ticker, price);
    }

    @Override
    public void updatePrice() {
        // High volatility: -5% to +7%
        double change = getRandomChange(-0.05, 0.07);
        this.currentPrice += this.currentPrice * change;
    }
}