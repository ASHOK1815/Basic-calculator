package com.epam.java_basic.calculator;

public class Calculator {

    public Calculator(int precision) {
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double add(double a, double b) {
        double temp = a + b;
        return (double) Math.round(temp * 100) / 100;
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double subtract(double a, double b) {
        double temp = a - b;
        return (double) Math.round(temp * 100) / 100;
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double multiply(double a, double b) {
        double temp = a * b;
        return (double) Math.round(temp * 100) / 100;
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double div(double a, double b) {
        double temp = a / b;
        return (double) Math.round(temp * 100) / 100;
        // throw new UnsupportedOperationException("You need to implement this method");
    }

}
