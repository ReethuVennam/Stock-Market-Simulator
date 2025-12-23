package com.stock;

public interface Tradable {
    void buy(int quantity, double price);
    void sell(int quantity, double price);
}