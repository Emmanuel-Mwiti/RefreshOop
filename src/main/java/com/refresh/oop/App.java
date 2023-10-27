package com.refresh.oop;

import com.refresh.oop.abstraction.InvestmentI;
import com.refresh.oop.compiletimepolymorphism.Calculator;
import com.refresh.oop.inheritance.Bond;
import com.refresh.oop.inheritance.Investment;
import com.refresh.oop.inheritance.MutualFund;
import com.refresh.oop.inheritance.Stock;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        inheritanceAndRuntimePolymorphism();
        encapsulation();
        abstractionUsingInterfaces();
        compileTimePolymorphism();

    }

    private static void compileTimePolymorphism() {
        System.out.println(Calculator.add(3, 4));//prioritize int addition
        System.out.println(Calculator.add(3.4, 4));//prioritize double addition
        //SO IN THIS TYPE OF COMPILE TIME POLYMORPHISM, WHERE THE METHOD TO RUN IS CHOOSE AT COMPILE TIME, WILL PRIORITIZE PRIMITIVES
    }

    private static void abstractionUsingInterfaces() {
        InvestmentI bond = new com.refresh.oop.abstraction.impl.Bond();
        InvestmentI stock = new com.refresh.oop.abstraction.impl.Stock();
        // So we can now call the constructs implemented
        bond.calculatePerformance();
        stock.calculatePerformance();
    }

    private static void encapsulation() {
        com.refresh.oop.encapsulation.Investment investment = new com.refresh.oop.encapsulation.Investment();
        //use the setters to access values and set them and get their values using getters
        investment.setName("default investment");
        investment.setSymbol("i_sybmol");
        investment.setPurchaseDate(LocalDate.now());
        investment.setPurchasePrice(20000.00);
        System.out.print("Name: " + investment.getName());
        System.out.print("Symbol: " + investment.getSymbol());
        System.out.print("Purchase Date: " + investment.getPurchaseDate());
        System.out.print("Purchase Price: " + investment.getPurchasePrice());
    }

    private static void inheritanceAndRuntimePolymorphism() {
        //? Here we also exercise runtime polymorphism
        Investment investment = new Investment("default investment", "i_sybmol", LocalDate.now(), 20000.00);
        Investment bonds = new Bond("bond investment", "b_sybmol", LocalDate.now(), 70000.00, 5000);
        Investment stock = new Stock("stock investment", "s_sybmol", LocalDate.now(), 80000.00, 10000);
        Investment mutualFund = new MutualFund("mutual investment", "mf_sybmol", LocalDate.now(), 598000, 500);
        System.out.println("Default Investment\n" + investment + "\nIs base Class");
        System.out.println("Bonds" + bonds + "\nIs Derived Class from Investment");
        System.out.println("Stocks" + stock + "\nIs Derived Class from Investment");
        System.out.println("Mutual Funds" + mutualFund + "\nIs Derived Class from Investment");
    }
}
