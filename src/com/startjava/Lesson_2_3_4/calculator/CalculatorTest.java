package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String exit = "yes";

        while (!exit.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            String userInput = console.nextLine();
            Calculator calculator = new Calculator(userInput.split(" "));

            if (calculator.chekSign()) {
                System.out.println("Ошибка: знак " + calculator.getSign() + " не поддерживается");
            } else {
                System.out.print(userInput + " = ");
                if (calculator.calculate() % 1 != .0) {
                    System.out.printf("%.3f", calculator.calculate());
                } else {
                    System.out.printf("%d", (int) calculator.calculate());
                }
            }
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                exit = console.next();
            } while (!exit.equals("yes") && !exit.equals("no"));
        }
    }
}