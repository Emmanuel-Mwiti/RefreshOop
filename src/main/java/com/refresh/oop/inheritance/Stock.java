package com.refresh.oop.inheritance;

import java.time.LocalDate;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */

public class Stock extends Investment {
    private int numberOfShares;

    //inherits from Investment class, and implements specific to the project
    public Stock(String name, String symbol, LocalDate purchaseDate, double purchasePrice, int numberOfShares) {
        super(name, symbol, purchaseDate, purchasePrice);
        this.numberOfShares = numberOfShares;
    }

    @Override
    public void calculateCurrentValue() {
        // Implement calculation based on stock market data
        System.out.println("Calculating current value of bonds with number of shares as: " + numberOfShares);

    }
}
