package com.stock;
import java.util.Random;

public abstract class Stock {
    private String ticker;
    protected double currentPrice;
    private Random random = new Random();

    public Stock(String ticker, double openingPrice) {
        this.ticker = ticker;
        this.currentPrice = openingPrice;
    }

    public abstract void updatePrice(); // Polymorphism

    public String getTicker() { return ticker; }
    public double getCurrentPrice() { return currentPrice; }

    protected double getRandomChange(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}