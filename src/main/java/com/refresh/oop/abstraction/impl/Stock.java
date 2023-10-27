package com.refresh.oop.abstraction.impl;

import com.refresh.oop.abstraction.InvestmentI;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class Stock implements InvestmentI {
    @Override
    public double calculateRisk() {
        return 0;
    }

    @Override
    public double calculatePerformance() {
        return 0;
    }
}
