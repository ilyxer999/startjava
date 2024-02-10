package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public char getSign() {
        return sign;
    }

    public double calculate(String[] mathExpression) {
        a = Integer.parseInt(mathExpression[0]);
        sign = mathExpression[1].charAt(0);
        b = Integer.parseInt(mathExpression[2]);
        switch (sign) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                return  (double) a / b;
            case '^' :
                return Math.pow(a, b);
            case '%' :
                return a % b;
        }
        return Double.MIN_VALUE;
    }
}