/*
Для всего документа исправления - исправил
1 задание - исправил
2 задание - исправил
3 задание - исправил
4 задание - исправить!!!
5 задание - исправил
6 задание - исправил

*/

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
        System.out.printf("В отрезке [%d, %d] сумма четных ", start, end);
        System.out.printf("чисел = %d, а нечетных = %d", sumEven, sumOdd);

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
        start = 1;
        end = 24;
        counter = 0;

        for (int i = start; i < end; i += 10) {
            for (int j = 0; j < 5; j++) {
                if (i + j * 2 < end && (i + j * 2) % 2 == 1) {
                    System.out.printf("%3d", i + j * 2);
                    counter++;
                } else {
                    System.out.printf("%3d", 0);
                    counter++;
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int copyNum = num5;
        int countTwos = 0;
        while (copyNum > 0) {
            if (copyNum % 10 == 2) {
                countTwos++;
            }
            copyNum /= 10;
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
            System.out.printf("%4d", i);
            System.out.printf("%6s%10c%15s", "", (char)i, "");
            System.out.printf("%-40s\n", Character.getName(i));
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%4d", i);
            System.out.printf("%6s%10c%15s", "", (char)i, "");
            System.out.printf("%-40s\n", Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num8 = 1234321;
        copyNum = num8;
        int digitsCounter = 0;
        while (copyNum > 0) {
            copyNum /= 10;
            digitsCounter++;
        }

        int counterDivider = digitsCounter / 2;
        int divider = 1;
        while (counterDivider > 0) {
            divider *= 10;
            counterDivider--;
        }

        int leftHalfNum = num8 / divider;
        if (digitsCounter % 2 != 0) {
            leftHalfNum /= 10;
        }

        int rightHalfNum = num8 % divider;
        int revrsedRightHalfNum = 0;
        while (rightHalfNum > 0) {
            int digit = rightHalfNum % 10;
            revrsedRightHalfNum = revrsedRightHalfNum * 10 + digit;
            rightHalfNum /= 10;
        }
        
        if (leftHalfNum == revrsedRightHalfNum) {
            System.out.printf("%d является палиндромом\n", num8);
        } else {
            System.out.printf("%d не является палиндромом\n", num8);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNum = 733338;
        int rightLuckyNum = luckyNum % 1000;
        int rightLuckySum = 0;
        copyNum = rightLuckyNum;
        for (int i = 0; i < 3; i++) {
            rightLuckySum += copyNum % 10;
            copyNum /= 10;
        }

        int leftLuckyNum = luckyNum / 1000;
        copyNum = leftLuckyNum;
        int leftLuckySum = 0;
        for (int i = 0; i < 3; i++) {
            leftLuckySum += copyNum % 10;
            copyNum /= 10;
        }
        if (leftLuckySum == rightLuckySum) {
            System.out.printf("Число %d является счастливым\n", luckyNum);

        } else {
            System.out.printf("Число %d не является счастливым\n", luckyNum);
        }
        System.out.printf("Сумма цифр %d = %d,", leftLuckyNum, leftLuckySum);
        System.out.printf(" а сумма %d = %d", rightLuckyNum, rightLuckySum);

        System.out.println("\n\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%26s\n", "ТАБЛИЦА   ПИФАГОРА");
        int num10 = 0;
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
                num10 = i*j;
                if (j == 1) {
                    System.out.printf("%d%2c", i, '|');
                } else {
                    System.out.printf("%4d", num10);
                }
            }
            System.out.println();
        }
    }
}