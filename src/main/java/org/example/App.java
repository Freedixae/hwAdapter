package org.example;

public class App {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 15));
        System.out.println(intsCalc.mult(5, 15));
        System.out.println(intsCalc.pow(5, 15));
    }
}
