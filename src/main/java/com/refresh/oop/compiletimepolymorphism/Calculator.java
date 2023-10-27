package com.refresh.oop.compiletimepolymorphism;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class Calculator {

    // This one will also help us check the specifics of how java will call the method, either prioritize the wrapper or primitive
    public static int add(int a, int b) {
        System.out.print("Here will have int primitive addition: ");
        return a + b;
    }

    public static int add(Integer a, Integer b) {
        System.out.print("Here will have int wrapper addition: ");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.print("Here will have int double primitive addition: ");
        return a + b;
    }
}
