package com.epam.java_basic;
import com.epam.java_basic.calculator.CalculatorTestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(CalculatorTestCase.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
