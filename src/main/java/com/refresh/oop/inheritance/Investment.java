package com.refresh.oop.inheritance;

import java.time.LocalDate;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */

public class Investment {

    // All investments should have a name, symbol, purchase date and purchase price, as properties and have a behaviour of calculating current value
    private String name;
    private String symbol;
    private LocalDate purchaseDate;
    private double purchasePrice;

    public Investment(String name, String symbol, LocalDate purchaseDate, double purchasePrice) {
        this.name = name;
        this.symbol = symbol;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    public void calculateCurrentValue() {
        // Implement the calculation based on the investment type
        System.out.println("Calculating investment value...");
    }

    @Override
    public String toString() {
        return "Investment{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", purchasePrice=" + purchasePrice +
                '}';
    }
}
