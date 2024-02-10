package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String exit = "yes";

        while (!exit.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = console.nextLine();
            Calculator calculator = new Calculator();

            double result = calculator.calculate(mathExpression.split(" "));
            printResult(mathExpression, result);

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            exit = console.next();

            if (!exit.equals("yes") && !exit.equals("no")) {
                System.out.print("Некорректный ввод. Повторите ввод [yes/no]: ");
                exit = console.next();
            }
        }
    }

    private static void printResult(String mathExpression, double result) {
        if (result == Double.MIN_VALUE) {
            System.out.println("Ошибка: знак " + mathExpression.charAt(2) + " не поддерживается");
        } else if (result % 1 != .0) {
            System.out.printf("%s = %.3f", mathExpression, result);
        } else {
            System.out.printf("%s = %d", mathExpression, (int) result);
        }
    }
}