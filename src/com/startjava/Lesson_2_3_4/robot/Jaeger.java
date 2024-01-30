package com.startjava.Lesson_2_3_4.robot;

public class Jaeger {

    private String mark;
    private double height;
    private int pilotsNum;

    public Jaeger() {}

    public Jaeger(String mark, double height, int pilotsNum) {
        this.mark = mark;
        this.height = height;
        this.pilotsNum = pilotsNum;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPilotsNum() {
        return pilotsNum;
    }

    public void setPilotsNum(int pilotsNum) {
        this.pilotsNum = pilotsNum;
    }

    public void goAhead() {
        System.out.println("Идет вперед");
    }

    public void killKaiju() {
        System.out.println("Кайдзю убит");
    }

    public void printInfo() {
        System.out.println("Поколение робота: " + mark);
        System.out.println("Высота робота: " + height);
        System.out.println("Количество пилотов: " + pilotsNum);
    }

    public void drift(boolean isDrift) {
        if (isDrift) {
            System.out.println("Вошли в дрифт");
        } else {
            System.out.println("Вышли из дрифта");
        }
    }
}