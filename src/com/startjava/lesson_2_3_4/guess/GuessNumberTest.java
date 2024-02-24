package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(scanner.nextLine());
        String userResponse = "yes";

        while (!userResponse .equals("no")) {
            GuessNumber game = new GuessNumber(player1, player2, player3);
            game.start();

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            userResponse  = scanner.next();
            scanner.nextLine();

            if (!userResponse .equals("yes") && !userResponse .equals("no")) {
                System.out.print("Некорректный ввод. Повторите ввод [yes/no]: ");
                userResponse  = scanner.next();
            }
        }
    }
}