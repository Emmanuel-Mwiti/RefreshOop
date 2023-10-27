package com.refresh.oop.solidprinciples.interfacesegragation.adhering.impl;

import com.refresh.oop.solidprinciples.interfacesegragation.adhering.AdminUserOperationOnInvestmentI;
import com.refresh.oop.solidprinciples.interfacesegragation.adhering.UserOperationOnInvestmentI;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class AdminUserOperation implements UserOperationOnInvestmentI, AdminUserOperationOnInvestmentI {
    @Override
    public void viewPortfolioDetails() {
        System.out.println("Admin user is viewing portfolio details");
    }

    @Override
    public void addInvestmentToPortfolio() {
        System.out.println("Admin user is adding investments to the  portfolio");
    }

    @Override
    public void updatePortfolioDetails() {
        System.out.println("Admin user is updating the portfolio details");
    }

    @Override
    public void removeInvestmentFromPortfolio() {
        System.out.println("Admin user is removing investments from the  portfolio");
    }
}
