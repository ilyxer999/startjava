public class CyclesTheme{
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int minValue = -10;
        int maxValue = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter1 = minValue;
        do{
            if (counter1 % 2 == 0) {
                sumEven += counter1;
            } else {
                sumOdd += counter1;
            }
            counter1++;
        } while (counter1 <= maxValue);
        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d\n", minValue, maxValue, sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int numA = 10;
        int numB = 5;
        int numC = -1;
        int maxNum2 = numA;
        int minNum2 = numA;
        if (numB > numA && numB >= numC) {
            maxNum2 = numB;
        } else if (numC > numA && numC > numB) {
            maxNum2 = numC;
        }
        if (numB < numA && numB <= numC) {
            minNum2 = numB;
        } else if (numC < numA && numC < numB) {
            minNum2 = numC;
        }
        for (int i = --maxNum2; i > minNum2; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num3 = 1234;
        int sum3 = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num3 > 0) {
            int digit3 = num3 % 10; 
            System.out.print(digit3);
            sum3 += digit3;
            num3 /= 10;
        }
        System.out.printf("\nСумма его цифр: %d", sum3);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int numStart = 1;
        int numEnd = 24;
        int counterNum = 0;
        for (int i = numStart; i < numEnd; i++) {
            if (i % 2 == 1) {
                System.out.printf("%3d", i);
                counterNum++;
                if (counterNum % 5 == 0) {
                    System.out.println();
                }
            }
        }
        while (counterNum % 5 != 0) {
            System.out.printf("%3d", 0);
            counterNum++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int duplicateNum5 = num5;
        int countOfTwos = 0;
        while (duplicateNum5 > 0) {
            int ones = duplicateNum5 % 10;
            if (ones == 2) {
                countOfTwos++;
            }
            duplicateNum5 /= 10;
        }
        if (countOfTwos == 0) {
            System.out.printf("В %d отсутствуют двойки", num5);
        } else if (countOfTwos % 2 == 0){
            System.out.printf("В %d четное количество двоек - %d", num5, countOfTwos);
        } else {
            System.out.printf("В %d нечетное количество двоек - %d", num5, countOfTwos);
        }

        System.out.println("\n\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        int rowNumber = 0;
        int columnCounter = 5;
        while (rowNumber < 5){
            int columnNumber = columnCounter;
            while (columnNumber > 0) {
                System.out.print("#");
                columnNumber--;
            }
            columnCounter--;
            System.out.println("");
            rowNumber++;
        }
        System.out.println();

        int reversalCounter = 0;
        int rowDollar = 0;
        do {
            int columnDollar = 0;
            do {
                System.out.print("$");
                columnDollar++;
            } while (columnDollar <= reversalCounter);
            System.out.println();
            rowDollar++;
            if (rowDollar < 3) {
                reversalCounter++;
            } else {
                reversalCounter--;
            }
        } while (rowDollar < 5);

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
        int duplicateNum8 = num8;
        int digitCounter = 0;
        while (duplicateNum8 > 0){
            duplicateNum8 /= 10;
            digitCounter++;
        }

        int counterDivider = digitCounter / 2;
        int divider = 1;
        while (counterDivider > 0){
            divider *= 10;
            counterDivider--;
        }

        int leftHalfNum8 = num8 / divider;
        if (digitCounter % 2 != 0) {
            leftHalfNum8 /= 10;
        }

        int rightHalfNum8 = num8 % divider;
        int revrsedRightHalfNum8 = 0;
        while (rightHalfNum8 > 0){
            int digitRightHalfNum8 = rightHalfNum8 % 10;
            revrsedRightHalfNum8 = revrsedRightHalfNum8 * 10 + digitRightHalfNum8;
            rightHalfNum8 /= 10;
        }
        
        if (leftHalfNum8 == revrsedRightHalfNum8) {
            System.out.printf("%d является палиндромом\n", num8);
        } else {
            System.out.printf("%d не является палиндромом\n", num8);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNum = 733338;
        int rightLuckyNum = luckyNum % 1000;
        int rightLuckySum = 0;
        int duplicateRightLuckyNum = rightLuckyNum;
        for (int i = 0; i < 3; i++) {
            rightLuckySum += duplicateRightLuckyNum % 10;
            duplicateRightLuckyNum /= 10;
        }

        int leftLuckyNum = luckyNum / 1000;
        int duplicateLeftLuckyNum = leftLuckyNum;
        int leftLuckySum = 0;
        for (int i = 0; i < 3; i++) {
            leftLuckySum += duplicateLeftLuckyNum % 10;
            duplicateLeftLuckyNum /= 10;
        }
        if (leftLuckySum == rightLuckySum) {
            System.out.printf("Число %d является счастливым\n", luckyNum);
            System.out.printf("Сумма цифр %d = %d, а сумма %d = %d\n", leftLuckyNum, leftLuckySum, rightLuckyNum, rightLuckySum);
        } else {
            System.out.printf("Число %d не является счастливым\n", luckyNum);
            System.out.printf("Сумма цифр %d = %d, а сумма %d = %d\n", leftLuckyNum, leftLuckySum, rightLuckyNum, rightLuckySum);
        }

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
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