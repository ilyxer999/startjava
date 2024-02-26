package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String[] PlayerNames = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < PlayerNames.length; i++) {
            System.out.printf("Введите имя игрока №%d: ", i + 1);
            PlayerNames[i] = scanner.nextLine();
        }

        String playerResponse = "yes";

        while (!playerResponse .equals("no")) {
            GuessNumber game = new GuessNumber(PlayerNames);
            game.start();

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            playerResponse  = scanner.next();
            scanner.nextLine();

            if (!playerResponse .equals("yes") && !playerResponse .equals("no")) {
                System.out.print("Некорректный ввод. Повторите ввод [yes/no]: ");
                playerResponse  = scanner.next();
            }
        }
    }
}