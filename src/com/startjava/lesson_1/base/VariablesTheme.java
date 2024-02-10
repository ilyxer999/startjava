package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte bitness = 64;
        System.out.println("Разрядность операционной системы: " + bitness + "-битная");
        short speedCpu = 3000;
        System.out.println("Тактовая частота процессора: " + speedCpu + " МГц"); 
        int ram = 8;
        System.out.println("Объем оперативной памяти: " + ram + " ГБ");
        long diskCapacity = 1_000_000_000l;
        System.out.println("Объем памяти жесткого диска: " + diskCapacity + " байт");
        float cpuTemperature = 65.5f;
        System.out.println("Температура работающего процессора: " + cpuTemperature + " градусов Цельсия");
        double computerWeight = 2.5;
        System.out.println("Вес компьютера: " + computerWeight + " килограмма");
        char dollar = '$';
        System.out.println("Стоимость компьютера: 421" + dollar);
        boolean hasPowerSavingMode = true;
        System.out.println("Есть ли режим энергосбережения: " + hasPowerSavingMode);
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice = 100;
        double bookPrice = 200;
        double discount = 0.11;
        double priceWithoutDiscount = penPrice + bookPrice;
        double sumDiscount = priceWithoutDiscount * discount;
        double discountPrice = priceWithoutDiscount - sumDiscount;
        System.out.println("Общая стоимость товаров без скидки: " + priceWithoutDiscount + " рублей");
        System.out.println("Сумма скидки: " + sumDiscount + " рубля");
        System.out.println("Общая стоимость товаров со скидкой " + discountPrice + " рублей");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.printf("%d; %d; %d\n", maxByte, ++maxByte, --maxByte);
        System.out.printf("%d; %d; %d\n", maxShort, ++maxShort, --maxShort);
        System.out.printf("%d; %d; %d\n", maxInt, ++maxInt, --maxInt);
        System.out.printf("%d; %d; %d\n", maxLong, ++maxLong, --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.printf("Исходные значения: num1 = %d, num2 = %d\n", num1, num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.printf("Новые значения: num1 = %d, num2 = %d\n", num1, num2);
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.printf("Исходные значения: num1 = %d, num2 = %d\n", num1, num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.printf("Новые значения: num1 = %d, num2 = %d\n", num1, num2);
        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.printf("Исходные значения: num1 = %d, num2 = %d\n", num1, num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.printf("Новые значения: num1 = %d, num2 = %d\n", num1, num2);

        System.out.println("\n6. Вывод символов и их кодов");
        System.out.printf("код символа: %d, соответствующий коду символ: %c\n", (int) dollar, dollar);
        char asterisk = '*';
        System.out.printf("код символа: %d, соответствующий коду символ: %c\n", (int) asterisk, asterisk);
        char atSign = '@';
        System.out.printf("код символа: %d, соответствующий коду символ: %c\n", (int) atSign, atSign);
        char verticalBar = '|';
        System.out.printf("код символа: %d, соответствующий коду символ: %c\n", (int) verticalBar, verticalBar);
        char tilde = '~';
        System.out.printf("код символа: %d, соответствующий коду символ: %c\n", (int) tilde, tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.printf("     %c%c\n", slash, backslash);
        System.out.printf("    %c  %c\n", slash, backslash);
        System.out.printf("   %c%c%c %c%c\n", slash, underscore, leftParenthesis, rightParenthesis, backslash);
        System.out.printf("  %c      %c\n", slash, backslash);
        System.out.printf(" %c%c%c%c%c", slash, underscore, underscore, underscore, underscore);
        System.out.printf("%c%c%c%c%c\n", slash, backslash, underscore, underscore, backslash);
        
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num8 = 123;
        int ones = num8 % 10;
        int tens = num8 / 10 % 10;
        int hundreds = num8 / 100;
        int sumDigits = tens + hundreds + ones;
        int productDigits = tens * hundreds * ones;
        System.out.printf("Число %d содержит:\n", num8);
        System.out.printf("  сотен - %d\n", hundreds);
        System.out.printf("  десятков - %d\n", tens);
        System.out.printf("  единиц - %d\n", ones);
        System.out.printf("Сумма его цифр = %d\n", sumDigits);
        System.out.printf("Произведение = %d\n", productDigits);

        System.out.println("\n9. Вывод времени");
        int currentSeconds = 86399;
        int hours = currentSeconds / 3600;
        int minutes = currentSeconds % 3600 / 60;
        int seconds = currentSeconds % 60;
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}