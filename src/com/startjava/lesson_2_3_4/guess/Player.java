package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAttempt(int number) {
        attempts[countAttempts] = number;
        countAttempts++;
    }

    public int getCurrentAttempt() {
        return attempts[countAttempts - 1];
    }

    public void setCountAttempts(int number) {
        countAttempts = number;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, countAttempts);
    }

    public void resetAttempts() {
        Arrays.fill(attempts, 0, countAttempts, 0);
    }
}