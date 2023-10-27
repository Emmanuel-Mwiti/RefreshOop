package com.refresh.oop.solidprinciples.singleresp.notadhering;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class InvestmentManager {
    private String name;
    private String category;

    public InvestmentManager(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void addInvestment() {
        System.out.println("Adding investment to the portfolio");
    }

    public void updateInvestment() {
        System.out.println("Updating investment in the portfolio");
    }

    public void deleteInvestment() {
        System.out.println("Adding investment to the portfolio");
    }
}
