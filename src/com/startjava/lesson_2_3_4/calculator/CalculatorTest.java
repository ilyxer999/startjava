package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String exit = "yes";

        while (!exit.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = console.nextLine();

            try {
                double result = Calculator.calculate(mathExpression);
                printResult(mathExpression, result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            exit = console.next();
            console.nextLine();

            if (!exit.equals("yes") && !exit.equals("no")) {
                System.out.print("Некорректный ввод. Повторите ввод [yes/no]: ");
                exit = console.next();
            }
        }
    }

    private static void printResult(String mathExpression, double result) {
        String stringResult = result % 1 != .0 ? String.format("%.3f", result) : String.format("%d", (int) result);
        System.out.println(mathExpression + " = " + stringResult);
    }
}