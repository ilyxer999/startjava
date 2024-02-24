package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player player3;
    Player[] Players = new Player[3];
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        Players[0] = player1;
        Players[1] = player2;
        Players[2] = player3;
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
        player.setNumber(currentNumber);
    }

    private boolean isGuessed(Player player, int hiddenNum) {
        if (player.getNumber() == hiddenNum) {
            System.out.println("Игрок " + player.getName() + " угадал " + player.getNumber() + " с " + player.getCounterAttempts() + " попытки");
            return true;
        }

        if (player.getNumber() > hiddenNum) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", player.getNumber());
        } else if (player.getNumber() < hiddenNum) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getNumber());
        }
        return false;
    }

    public void printResultAttempts() {
        for (Player player : Players) {
            divide();
            System.out.printf("Введенные игроком %s числа:\n", player.getName());
            int[] attemptsPlayer = Arrays.copyOf(player.getAttempts(), player.getCounterAttempts());
            for (int i = 0; i < attemptsPlayer.length; i++) {
                if (i == (attemptsPlayer.length + 1) / 2) {
                    System.out.println();
                }
                System.out.print(attemptsPlayer[i] + " ");
            }
            System.out.println();
        }
    }

    public void resetAttemptsAndCount() {
        for (Player player : Players) {
            player.resetAttempts();
            player.setCounterAttempts(0);
        }
    }

    private void divide() {
        System.out.println("---------------------------------------------------------");
    }
}