package com.refresh.oop.inheritance;

import java.time.LocalDate;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class MutualFund extends Investment {
    private double netAssetValue;

    public MutualFund(String name, String symbol, LocalDate purchaseDate, double purchasePrice, double netAssetValue) {
        super(name, symbol, purchaseDate, purchasePrice);
        this.netAssetValue = netAssetValue;
    }

    @Override
    public void calculateCurrentValue() {
        // Implement calculation based on mutual fund market data
        System.out.println("Calculating the mutal fund current value having the net asset value of: " + netAssetValue);
    }
}
