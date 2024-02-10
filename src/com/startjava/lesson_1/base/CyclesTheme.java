package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = start;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= end);
        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d", 
                start, end, sumEven, sumOdd);

        System.out.println("\n\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num > 0) {
            int digit = num % 10; 
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.printf("\nСумма его цифр: %d", sum);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i+=2) {
            System.out.printf("%3d ", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d ", 0);
            count++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int copyNum5 = num5;
        int countTwos = 0;
        while (copyNum5 > 0) {
            if (copyNum5 % 10 == 2) {
                countTwos++;
            }
            copyNum5 /= 10;
        }
        if (countTwos == 0) {
            System.out.printf("В %d отсутствуют двойки", num5);
        } else if (countTwos % 2 == 0) {
            System.out.printf("В %d четное количество двоек - %d", num5, countTwos);
        } else {
            System.out.printf("В %d нечетное количество двоек - %d", num5, countTwos);
        }

        System.out.println("\n\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        int row = 0;
        int column = 5;
        while (row < 5) {
            counter = column;
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            column--;
            System.out.println();
            row++;
        }
        System.out.println();

        int reversalCounter = 0;
        row = 0;
        do {
            counter = 0;
            do {
                System.out.print("$");
                counter++;
            } while (counter <= reversalCounter);
            System.out.println();
            row++;
            if (row < 3) {
                reversalCounter++;
            } else {
                reversalCounter--;
            }
        } while (row < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-15s%-15s%-15s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i < 48; i += 2) {
            System.out.printf("  %-15d  %-15c %s\n", i, i, Character.getName(i));
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("  %-15d  %-15c %s\n", i, i, Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num8 = 1234321;
        int copyNum8 = num8;
        int reversedNum8 = 0;
        while (copyNum8 > 0) {
            reversedNum8 = reversedNum8 * 10 + copyNum8 % 10;
            copyNum8 /= 10;
        }
        if (num8 == reversedNum8) {
            System.out.printf("%d является палиндромом\n", num8);
        } else {
            System.out.printf("%d не является палиндромом\n", num8);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int num9 = 123456;
        int copyNum9 = num9;
        int rightHalfSum = 0;
        int leftHalfSum = 0;

        for (int i = 0; i < 6; i++) {
            int digit = copyNum9 % 10;
            if (i < 3) {
                rightHalfSum += digit;
            } else {
                leftHalfSum += digit;
            }
            copyNum9 /= 10;
        }
        
        if (leftHalfSum == rightHalfSum) {
            System.out.printf("Число %d является счастливым\n", num9);

        } else {
            System.out.printf("Число %d не является счастливым\n", num9);
        }
        System.out.printf("Сумма цифр %d = %d, ", num9 / 1000, leftHalfSum);
        System.out.printf("а сумма %d = %d", num9 % 1000, rightHalfSum);

        System.out.println("\n\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%26s\n", "ТАБЛИЦА   ПИФАГОРА");
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("%3c", '|');
            } else {
                System.out.printf("%4d", i);
            }
        }
        System.out.println("\n-----------------------------------");
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    System.out.printf("%d%2c", i, '|');
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            System.out.println();
        }
    }
}