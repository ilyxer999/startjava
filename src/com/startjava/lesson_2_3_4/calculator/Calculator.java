package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");

        if (elements.length != 3) {
            throw new RuntimeException("Введите корректный формат выражения! Пример: \n5 + 2");
        }

        checkNumber(elements);

        int a = Integer.parseInt(elements [0]);
        char sign = elements[1].charAt(0);
        int b = Integer.parseInt(elements [2]);

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

    public static void checkNumber(String[] elements) {

        try {
            double a = Double.parseDouble(elements[0]);
            double b = Double.parseDouble(elements[2]);

            if (a < 1 || b < 1) {
                throw new RuntimeException("Введенные числа должны быть положительными");
            }
            throw new RuntimeException("Введеные числа должны быть целыми!");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Введенное выражение должно содержать два числа и знак между ними!");
        }
    }
}