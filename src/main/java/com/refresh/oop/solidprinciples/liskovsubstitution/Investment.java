package com.refresh.oop.solidprinciples.liskovsubstitution;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class Investment {
    private String name;
    private String category;

    public Investment(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void calculateROI() {
        System.out.println("Calculating rate of return for the investment");
    }

}
