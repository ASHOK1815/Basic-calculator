package com.epam.java_basic.calculator;

import static java.lang.Boolean.*;
import static java.lang.Double.isInfinite;

public class Calculator {

    public Calculator(int precision) {
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double add(double a, double b) {
        double temp = a + b;
        if  (isInfinite(temp)){
            if (temp>0){
                return Double.POSITIVE_INFINITY;
            }
            else {
                return Double.NEGATIVE_INFINITY;
            }

        }
        else {
            String s = String.format("%.2f",temp);
            double t = Double.parseDouble(s);
            return t;
        }
        //return (double) Math.round(temp * 100) / 100;
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double subtract(double a, double b) {
        double temp = a - b;
        if  (isInfinite(temp)){
            if (temp>0){
                return Double.POSITIVE_INFINITY;
            }
            else {
                return Double.NEGATIVE_INFINITY;
            }

        }
        else {
            String s = String.format("%.2f",temp);
            double t = Double.parseDouble(s);
            return t;
        }
    }

    public double multiply(double a, double b) {
        double temp = a * b;
        if  (isInfinite(temp)){
            if (temp>0){
                return Double.POSITIVE_INFINITY;
            }
            else {
                return Double.NEGATIVE_INFINITY;
            }

        }
        else {
            String s = String.format("%.2f",temp);
            double t = Double.parseDouble(s);
            return t;
        }
        // throw new UnsupportedOperationException("You need to implement this method");
    }

    public double div(double a, double b) {
        double temp = a / b;
        if  (isInfinite(temp)){
            if (temp>0){
                return Double.POSITIVE_INFINITY;
            }
            else {
                return Double.NEGATIVE_INFINITY;
            }

        }
        else {
            String s = String.format("%.2f",temp);
            double t = Double.parseDouble(s);
            return t;
        }
        // throw new UnsupportedOperationException("You need to implement this method");
    }

}
