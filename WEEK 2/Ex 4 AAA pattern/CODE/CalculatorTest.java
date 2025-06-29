package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }

    @Test
    public void testAdd() {
        int a = 5;
        int b = 10;
        int result = calculator.add(a, b);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int a = 20;
        int b = 5;
        int result = calculator.subtract(a, b);
        assertEquals(15, result);
    }

    @Test
    public void testMultiply() {
        int a = 4;
        int b = 3;
        int result = calculator.multiply(a, b);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int a = 10;
        int b = 2;
        int result = calculator.divide(a, b);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
