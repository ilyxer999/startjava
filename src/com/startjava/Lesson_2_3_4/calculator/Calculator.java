package com.startjava.Lesson_2_3_4.calculator;

import java.util.Arrays;

public class Calculator {
    private int a;
    private int b;
    private char sign;


    public Calculator(String[] mathOperation) {
        a = Integer.parseInt(mathOperation[0]);
        sign = mathOperation[1].charAt(0);
        b = Integer.parseInt(mathOperation[2]);
    }

    public char getSign() {
        return sign;
    }

    public double calculate() {
        double result = 0;
        switch (sign) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = (double) a / b;
                break;
            case '^' :
                result = Math.pow(a, b);
                break;
            case '%' :
                result = a % b;
                break;
        }
        return result;
    }

    public boolean chekSign() {
        char[] mathSigns = {'+', '-', '*', '/', '^', '%'};
        Arrays.sort(mathSigns);
        if (Arrays.binarySearch(mathSigns, sign) < 0) {
            return true;
        }
        return  false;
    }
}