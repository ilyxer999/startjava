package com.startjava.Lesson_2_3.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private int result;

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        }
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
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
                result = a / b;
                break;
            case '^' :
                result = a;
                for (int i = 2; i <= b; i++) {
                    result *= a;
                }
                break;
            case '%' :
                result = a % b;
                break;
            default :
                sign = '\u0000';
        }
    }

    public void printResult() {
        if (a == 0 || b == 0 || sign == '\u0000') {
            System.out.println("Некорректный ввод");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}