package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String exit = "yes";

        while (!exit.equals("no")) {
            System.out.print("Введите первое число: ");
            calculator.setA(console.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(console.nextInt());
            calculator.calculate();
            calculator.printResult();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                exit = console.next();
            } while (!exit.equals("yes") && !exit.equals("no"));
        }
    }
}