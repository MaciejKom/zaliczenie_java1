package com.example;

import com.example.util.LoggerUtil;

public class App {
    public static void main(String[] args) {
        LoggerUtil.log("Hello, world!");
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        LoggerUtil.log("Result: " + result);
    }
}
