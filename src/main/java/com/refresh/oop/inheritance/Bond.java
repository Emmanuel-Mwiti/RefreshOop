package com.refresh.oop.inheritance;

import java.time.LocalDate;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class Bond extends Investment {
    private int faceValue;

    public Bond(String name, String symbol, LocalDate purchaseDate, double purchasePrice, int faceValue) {
        super(name, symbol, purchaseDate, purchasePrice);
        this.faceValue = faceValue;
    }

    @Override
    public void calculateCurrentValue() {
        // Implement calculation based on bond market data
        System.out.println("Calculating the current value of bonds with face value of: " + faceValue);
    }
}

