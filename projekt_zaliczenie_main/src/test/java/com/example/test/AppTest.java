package com.example.test;

import com.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 7);
        assertEquals(12, result);
    }
}
