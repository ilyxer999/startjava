package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    static int len;

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        reverseArray();

        System.out.println("\n2. Произведение элементов массива");
        calculateFactorial();

        System.out.println("\n3. Удаление элементов массива");
        removeElements();

        System.out.println("\n4. Вывод алфавита лесенкой");
        printAlphabetStairs();

        System.out.println("\n5. Заполнение массива уникальными числами");
        fillUniqueNumbers();
    }

    private static void reverseArray() {
        int[] intNumbers = {1, 7, 4, 5, 2, 6, 3};
        printArray("До реверса: ", intNumbers);
        len = intNumbers.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = intNumbers[i];
            intNumbers[i] = intNumbers[--len];
            intNumbers[len] = temp;
        }
        printArray("После реверса: ", intNumbers);
    }

    private static void printArray(String prefix, int[] array) {
        StringBuilder result = new StringBuilder(prefix + "[");
        len = array.length;
        for (int i = 0; i < len; i++) {
            result.append(array[i]);
            if (i < len - 1) {
                result.append(", ");
            }
        }
        System.out.println(result.append("]"));
    }

    private static void calculateFactorial() {
        int[] multipliers = new int[10];
        len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= i;
            System.out.print(multipliers[i]);
            String mathSign = (i == len - 2) ? " = " : " * ";
            System.out.print(mathSign);
        }
        System.out.println(product);
    }

    private static void removeElements() {
        double[] randomNumbers = new double[15];
        len = randomNumbers.length;
        for (int i = 0; i < len; i++) {
            randomNumbers[i] = Math.random();
        }
        printArray("Исходный массив: \n",randomNumbers);

        double middleCellValue = randomNumbers[(len - 1) / 2];
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (middleCellValue < randomNumbers[i]) {
                randomNumbers[i] = 0;
                counter++;
            }
        }
        printArray("Измененный массив: \n",randomNumbers);
        System.out.println("Количество обнуленных ячеек: " + counter);
    }

    private static void printArray(String prefix, double[] array) {
        System.out.print(prefix);
        len = array.length;
        for (int i = 0; i < len; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();
    }

    private static void printAlphabetStairs() {
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j != i - 1; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillUniqueNumbers() {
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        for (int i = 0; i < len; i++) {
            int num;
            do {
                num = (int) (Math.random() * 40) + 60;
            } while (findNum(uniqueNumbers, num));
            uniqueNumbers[i] = num;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < len - 1; i++) {
                if (uniqueNumbers[i] > uniqueNumbers[i + 1]) {
                    int temp = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[i + 1];
                    uniqueNumbers[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(uniqueNumbers[i]);
            } else {
                System.out.print(uniqueNumbers[i] + ", ");
            }
        }
    }

    private static boolean findNum(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
