package com.startjava.lesson_1._final;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = 67;
        int playerNum = 54;
        if (computerNum < 1 || computerNum > 100) {
            System.out.println("Измените число, которое необходимо отгадать");
        } else {
            while (computerNum != playerNum) {
                if (playerNum > computerNum) {
                    System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
                    playerNum -= 3;
                } else {
                    System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNum);
                    playerNum += 5;
                }
            }
        }
        System.out.println("Вы победили!");
    }
}