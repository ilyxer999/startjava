public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Вы женщина!");
        } else {
            System.out.println("Вы мужчина!");
        }
        int age = 21;
        if (age > 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Вы несовершеннолетний!");
        }
        double height = 2;
        if (height < 1.8) {
            System.out.println("Вы ниже среднего роста!");
        } else {
            System.out.println("Вы выше среднего роста!");
        }
        char firstLetterOfName = "Ilya".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Ваше имя начинается с буквы 'M'!"); 
        } else if (firstLetterOfName == 'I') {
            System.out.println("Ваше имя начинается с буквы 'I'!"); 
        } else {
            System.out.println("Ваше имя не начинается с букв 'M' или 'I'!"); 
        }

        System.out.println("\n2. Поиск большего числа");
        int num1 = 2;
        int num2 = 3;
        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        } else {
            System.out.printf("%d = %d\n", num1, num2);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 35;
        boolean isZero = num3 == 0;
        boolean greaterThanZero = num3 > 0;
        boolean isEven = num3 % 2 == 0;
        if (isZero) {
            System.out.println("Число равно 0\n");
        } else {
            if (greaterThanZero) {
                if (isEven) {
                    System.out.printf("%d является положительным и четным\n", num3);
                } else {
                    System.out.printf("%d является положительным и нечетным\n", num3);
                }
            } else {
                if (isEven) {
                    System.out.printf("%d является отрицательным и четным\n", num3);
                } else {
                    System.out.printf("%d является отрицательным и нечетным\n", num3);
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num123 = 171;
        int num234 = 152;
        int digitNum123 = num123 % 10;
        int digitNum234= num234 % 10;
        int tensNum123 = num123 / 10 % 10;
        int tensNum234 = num234 / 10 % 10;
        int hundredsNum123 = num123 / 100;
        int hundredsNum234 = num234 / 100;
        boolean isEqualDigit = digitNum123 == digitNum234;
        boolean isEqualTens = tensNum123 == tensNum234;
        boolean isEqualHundreds = hundredsNum123 == hundredsNum234;
        if (!isEqualDigit && !isEqualTens && !isEqualHundreds) {
            System.out.println("В заданных числах нет равных цифр");
        } else if (isEqualDigit && isEqualTens && isEqualHundreds) {
            System.out.println("Все числа равны");
        } else {
            if (isEqualDigit && isEqualTens) {
                System.out.printf("Числа %d и %d равны по разрядам 1 и 2, одинаковые в них цифры %d и %d, %d и %d\n", num123, num234, tensNum123, tensNum234, digitNum123, digitNum234);
            } else if (isEqualDigit && isEqualHundreds) {
                System.out.printf("Числа %d и %d равны по разрядам 1 и 3, одинаковые в них цифры %d и %d, %d и %d\n", num123, num234, hundredsNum123, hundredsNum234, digitNum123, digitNum234);
            } else if (isEqualTens && isEqualHundreds) {
                System.out.printf("Числа %d и %d равны по разрядам 2 и 3, одинаковые в них цифры %d и %d, %d и %d\n", num123, num234, hundredsNum123, hundredsNum234, tensNum123, tensNum234);
            } else {
                if (isEqualDigit) {
                    System.out.printf("Числа %d и %d равны по разряду 1, одинаковые в них цифры %d и %d\n", num123, num234, digitNum123, digitNum234);
                } else if (isEqualTens) {
                    System.out.printf("Числа %d и %d равны по разряду 2, одинаковые в них цифры %d и %d\n", num123, num234, tensNum123, tensNum234);
                } else {
                    System.out.printf("Числа %d и %d равны по разряду 3, одинаковые в них цифры %d и %d\n", num123, num234, hundredsNum123, hundredsNum234);
                }
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u007D';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.printf("Символ %c является большой буквой\n", symbol);
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.printf("Символ %c является маленькой буквой\n", symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.printf("Символ %c является цифрой\n", symbol);
        } else {
            System.out.printf("Символ %c не является ни буквой, ни цифрой\n", symbol);
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double depositAmount = 301_000;
        double percentRate;
        if (depositAmount < 100_000) {
            percentRate = 0.05;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            percentRate = 0.07;
        } else {
            percentRate = 0.1;
        }
        double accuredPercent = depositAmount * percentRate;
        double totalAmount = depositAmount + accuredPercent;
        System.out.printf("Сумма вклада: %.2f руб, сумма начисленного процента: %.2f руб, итоговая сумма: %.2f руб\n", depositAmount, accuredPercent, totalAmount);
    
        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 59;
        double programmingPercent = 92;
        double averageScore = (historyPercent + programmingPercent) / 2;
        int historyGrade;
        int programmingGrade;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        double averageGrade = ((double)historyGrade + (double)programmingGrade) / 2;
        System.out.printf("оценка по истории - %d, оценка по программированию - %d\n", historyGrade, programmingGrade);
        System.out.printf("средний балл оценок по предметам - %.1f, средний процент по предметам - %.1f\n", averageGrade, averageScore);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyIncome = 14000;
        int yearlyIncome = monthlyIncome * 12;
        int monthlyRent = 5000;
        int yearlyRent = monthlyRent * 12;
        int monthlyProductionCost = 9000;
        int yearlyProductionCost = monthlyProductionCost* 12;
        int profit = yearlyIncome - (yearlyRent + yearlyProductionCost);
        if (profit > 0) {
            System.out.printf("Прибыль за год: +%d руб.\n", profit);
        } else {
            System.out.printf("Прибыль за год: %d руб.\n", profit);
        }
    }
}