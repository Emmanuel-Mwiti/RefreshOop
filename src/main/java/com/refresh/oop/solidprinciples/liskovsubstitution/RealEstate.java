package com.refresh.oop.solidprinciples.liskovsubstitution;

import com.refresh.oop.solidprinciples.singleresp.adhering.Investment;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class RealEstate extends Investment {
    public RealEstate(String name, String category) {
        super(name, category);
    }

    public void calculatePropertyTax() {
        // This one does not adhere to the liskov substitution principle, cannot be substitutable to the base class reference
        System.out.println("Calculating property tax");
    }
}
