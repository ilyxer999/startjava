package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        int a = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int b = Integer.parseInt(expression[2]);

        if (a < 1 || b < 1) {
            throw new RuntimeException();
        }

        double result;
        switch (sign) {
            case '+' -> result =  a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = (double) a / b;
            case '^' -> result = Math.pow(a, b);
            case '%' -> result = a % b;
            default -> throw new IllegalArgumentException();
        };
        return result;
    }
}