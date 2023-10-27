package com.refresh.oop.solidprinciples.liskovsubstitution;

import com.refresh.oop.solidprinciples.singleresp.adhering.Investment;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class Bond extends Investment {
    public Bond(String name, String category) {
        super(name, category);
    }

    @Override
    public void calculateROI() {
        //this one is adhering to the liskov subsitution principle
        System.out.println("Calculating rate of return for the Bond specific");
    }
}
