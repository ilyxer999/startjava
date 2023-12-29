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
            System.out.printf("%d > %d", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%d < %d", num1, num2);
        } else {
            System.out.printf("%d = %d", num1, num2);
        }

        System.out.println("\n\n3. Проверка числа");
        int num3 = -40;
        if (num3 == 0) {
            System.out.println("Число равно 0");
        } else {
            String positivity = (num3 > 0) ? "положительным" : "отрицательным";
            String parity = (num3 % 2 == 0) ? "четным" : "нечетным";
            System.out.printf("%d является %s и %s", num3, positivity, parity);
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int numA = 123;
        int numB = 223;
        int onesA = numA % 10;
        int onesB = numB % 10;
        int tensA = numA / 10 % 10;
        int tensB = numB / 10 % 10;
        int hundredsA = numA / 100;
        int hundredsB = numB / 100;
        boolean isEqualOnes = onesA == onesB;
        boolean isEqualTens = tensA == tensB;
        boolean isEqualHundreds = hundredsA == hundredsB;
        System.out.printf("В заданных числах %d и %d ", numA, numB);
        if (!isEqualOnes && !isEqualTens && !isEqualHundreds) {
            System.out.print("нет равных цифр");
        } else {
            if (isEqualOnes) {
                System.out.printf("\nцифры %d и %d равны по 1 разряду", onesA, onesB);
            } 
            if (isEqualTens) {
                System.out.printf("\nцифры %d и %d равны по 2 разряду", tensA, tensB);
            }
            if (isEqualHundreds) {
                System.out.printf("\nцифры %d и %d равны по 3 разряду", hundredsA, hundredsB);
            }
        }

        System.out.println("\n\n5. Определение символа по его коду");
        char symbol = '\u007D';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.printf("Символ %c является большой буквой", symbol);
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.printf("Символ %c является маленькой буквой", symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.printf("Символ %c является цифрой", symbol);
        } else {
            System.out.printf("Символ %c не является ни буквой, ни цифрой", symbol);
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %");
        double depositAmount = 301_000;
        double percentRate = 0.07;
        if (depositAmount < 100_000) {
            percentRate = 0.05;
        } else if (depositAmount > 300_000) {
            percentRate = 0.1;
        }
        double accuredPercent = depositAmount * percentRate;
        double totalAmount = depositAmount + accuredPercent;
        System.out.printf("Сумма вклада: %.2f руб, ", depositAmount);
        System.out.printf("сумма начисленного процента: %.2f руб, ", accuredPercent);
        System.out.printf("итоговая сумма: %.2f руб", totalAmount);

        System.out.println("\n\n7. Определение оценки по предметам");
        double historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        int programmingGrade = 2;
        double programmingPercent = 92;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        double averageGrade = (historyGrade + programmingGrade) / 2d;
        double averageScore = (historyPercent + programmingPercent) / 2;
        System.out.printf("оценка по истории - %d, оценка по программированию - %d\n", historyGrade, programmingGrade);
        System.out.printf("средний балл оценок по предметам - %.1f\n", averageGrade);
        System.out.printf("средний процент по предметам - %.1f", averageScore);

        System.out.println("\n\n8. Расчет годовой прибыли");
        int monthlyIncome = 13000;
        int monthlyRent = 5000;
        int monthlyProductionCost = 9000;
        int yearlyProfit = (monthlyIncome - monthlyRent - monthlyProductionCost) * 12;
        if (yearlyProfit > 0) {
            System.out.printf("Прибыль за год: +%d руб.", yearlyProfit);
        } else {
            System.out.printf("Прибыль за год: %d руб.", yearlyProfit);
        }
    }
}