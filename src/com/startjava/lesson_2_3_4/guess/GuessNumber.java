package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    Player[] Players = new Player[3];
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(String[] PlayerNames) {
        for (int i = 0; i < Players.length; i++) {
            Players[i] = new Player(PlayerNames[i]);
        }
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        int hiddenNum = (int) (Math.random() * 100) + 1;
        boolean isExit = false;

        for (int i = 0; i < 10; i++) {
            for (Player player : Players) {
                divide();
                inputNumber(player);

                if (isGuessed(player, hiddenNum)) {
                    isExit = true;
                    break;
                }

                if (i == 9) {
                    System.out.println("У " + player.getName() + " кончились попытки");
                }
            }
            if (isExit) {
                break;
            }
        }

        printResultAttempts();
        resetAttemptsAndCount();
    }

    private void inputNumber(Player player) {
        int currentNumber;
        do {
            System.out.printf("%s, введите число от 1 до 100: ", player.getName());
            currentNumber = scanner.nextInt();
        } while (currentNumber < 0 || currentNumber > 100);
        player.addAttempt(currentNumber);
    }

    private boolean isGuessed(Player player, int hiddenNum) {
        if (player.getCurrentAttempt() == hiddenNum) {
            System.out.println("Игрок " + player.getName() + " угадал " + player.getCurrentAttempt() + " с " +
                    player.getCountAttempts() + " попытки");
            return true;
        }

        if (player.getCurrentAttempt() > hiddenNum) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", player.getCurrentAttempt());
        } else if (player.getCurrentAttempt() < hiddenNum) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getCurrentAttempt());
        }
        return false;
    }

    private void printResultAttempts() {
        for (Player player : Players) {
            divide();
            System.out.printf("Введенные игроком %s числа:\n", player.getName());
            int[] attemptsPlayer = player.getAttempts();
            for (int i = 0; i < attemptsPlayer.length; i++) {
                if (i == (attemptsPlayer.length + 1) / 2) {
                    System.out.println();
                }
                System.out.print(attemptsPlayer[i] + " ");
            }
            System.out.println();
        }
    }

    private void resetAttemptsAndCount() {
        for (Player player : Players) {
            player.resetAttempts();
            player.setCountAttempts(0);
        }
    }

    private void divide() {
        System.out.println("---------------------------------------------------------");
    }
}