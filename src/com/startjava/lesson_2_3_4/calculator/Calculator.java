package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        int a = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int b = Integer.parseInt(expression[2]);
        switch (sign) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                return (double) a / b;
            case '^' :
                return Math.pow(a, b);
            case '%' :
                return a % b;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
        }
        return Double.MIN_VALUE;
    }
}