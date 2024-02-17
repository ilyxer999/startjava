package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");

        if (elements.length != 3) {
            throw new RuntimeException("Введено некорректное выражение!");
        }

        try {
            int a = Integer.parseInt(elements[0]);
            int b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Введены не числа!");
        }

        int a = Integer.parseInt(elements [0]);
        char sign = elements[1].charAt(0);
        int b = Integer.parseInt(elements [2]);

        if (a < 1 || b < 1) {
            throw new RuntimeException("Введенные числа должны быть больше 0");
        }

            return switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> (double) a / b;
                case '^' -> Math.pow(a, b);
                case '%' -> a % b;
                default -> throw new RuntimeException("Введен некорректный знак!");
            };
    }
}