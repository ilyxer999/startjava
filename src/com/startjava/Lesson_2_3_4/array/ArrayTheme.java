package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    static int len;

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        reverseArray();

        System.out.println("\n2. Произведение элементов массива");
        calculateProduct();

        System.out.println("\n3. Удаление элементов массива");
        removeElements();

        System.out.println("\n4. Вывод алфавита лесенкой");
        printAlphabetStairs();

        System.out.println("\n5. Заполнение массива уникальными числами");
        fillUniqueNumbers();
    }

    private static void reverseArray() {
        int[] intNumbers = {1, 7, 4, 5, 2, 6, 3};
        printIntArray("До реверса: ", intNumbers);
        len = intNumbers.length;
        for (int i = 0; i < intNumbers.length / 2; i++) {
            int temp = intNumbers[i];
            --len;
            intNumbers[i] = intNumbers[len];
            intNumbers[len] = temp;
        }
        printIntArray("После реверса: ", intNumbers);
    }

    private static void printIntArray(String prefix, int[] array) {
        StringBuilder result = new StringBuilder(prefix + "[");
        len = array.length;
        for (int i = 0; i < len; i++) {
            result.append(array[i]);
            if (i == len - 1) {
                result.append("]");
            } else {
                result.append(", ");
            }
        }
        System.out.println(result);
    }

    private static void calculateProduct() {
        int[] intNumbers = new int[10];
        len = intNumbers.length;
        for (int i = 0; i < len; i++) {
            intNumbers[i] = i;
        }

        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= i;
            System.out.print(intNumbers[i]);
            String mathSign = (i == len - 2) ? " = " : " * ";
            System.out.print(mathSign);
        }
        System.out.println(product);
    }

    private static void removeElements() {
        double[] doubleNumbers = new double[15];
        len = doubleNumbers.length;
        for (int i = 0; i < len; i++) {
            doubleNumbers[i] = Math.random();
        }
        printDoubleArray("Исходный массив: \n",doubleNumbers);

        double middleCellValue = doubleNumbers[(len - 1) / 2];
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (middleCellValue < doubleNumbers[i]) {
                doubleNumbers[i] = 0;
                counter++;
            }
        }
        printDoubleArray("Измененный массив: \n",doubleNumbers);
        System.out.println("Количество обнуленных ячеек: " + counter);
    }

    private static void printDoubleArray(String prefix, double[] array) {
        StringBuilder result = new StringBuilder(prefix);
        len = array.length;
        for (int i = 0; i < len; i++) {
            String stringArrayValue = Double.toString(array[i]);
            if (i == 7) {
                result.append(String.format("%.5s", stringArrayValue)).append("\n");
            } else {
                result.append(String.format("%.5s ", stringArrayValue));
            }
        }
        System.out.println(result);
    }

    private static void printAlphabetStairs() {
        char[] alphabetChars = new char[26];
        len = alphabetChars.length;
        for (int i = 0; i < len; i++) {
            alphabetChars[i] = (char) ('A' + i);
        }

        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                if (j != i - 1) {
                    System.out.print(alphabetChars[j]);
                } else {
                    break;
                }
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
                System.out.print(uniqueNumbers[i]);
                System.out.println();
            } else {
                System.out.print(uniqueNumbers[i] + ", ");
            }
        }
    }

    private static boolean findNum(int[] array, int num) {
        boolean isFoundNum = false;
        for (int i : array) {
            if (i == num) {
                isFoundNum = true;
                break;
            }
        }
        return isFoundNum;
    }
}
