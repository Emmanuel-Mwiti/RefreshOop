package com.refresh.oop.solidprinciples.interfacesegragation.notadhering;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class NoviceUserOperations implements UserOperationOnInvestmentI {

    // Here assume that the novice user is only entitled to viewing details of the portfolio, so we implement that only
    @Override
    public void viewPortfolioDetails() {
        System.out.println("The novice user is viewing portfolio details");
    }

    //Other implementations are not use, therefore we violate interface segregation principle
    @Override
    public void addInvestmentToPortfolio() {

    }

    @Override
    public void updatePortfolioDetails() {

    }

    @Override
    public void removeInvestmentFromPortfolio() {

    }
}
