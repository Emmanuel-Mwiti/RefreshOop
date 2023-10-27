package com.refresh.oop.solidprinciples.interfacesegragation.adhering.impl;

import com.refresh.oop.solidprinciples.interfacesegragation.adhering.UserOperationOnInvestmentI;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class NoviceUserOperation implements UserOperationOnInvestmentI {
    @Override
    public void viewPortfolioDetails() {
        System.out.println("The novice user is viewing portfolio details");
    }
}
