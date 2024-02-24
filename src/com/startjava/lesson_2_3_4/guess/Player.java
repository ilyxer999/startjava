package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] attempts = new int[10];
    private int counterAttempts = 0;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
            this.number = number;
            attempts[counterAttempts] = number;
            counterAttempts++;
    }

    public void setCounterAttempts(int number) {
        counterAttempts = number;
    }

    public int getCounterAttempts() {
        return counterAttempts;
    }

    public int[] getAttempts() {
        return attempts;
    }

    public void resetAttempts() {
        Arrays.fill(attempts, 0, counterAttempts, 0);
    }
}