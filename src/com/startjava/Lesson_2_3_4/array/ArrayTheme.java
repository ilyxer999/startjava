package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    static int len;

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] array1 = {1, 7, 4, 5, 2, 6, 3};
        System.out.println(printIntArray("До реверса: ", array1));
        len = array1.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = array1[i];
            array1[i] = array1[len - i - 1];
            array1[len - i - 1] = temp;
        }
        System.out.println(printIntArray("После реверса: ", array1));

        System.out.println("\n2. Произведение элементов массива");
        int[] array2 = new int[10];
        len = array2.length;
        for (int i = 0; i < len; i++) {
            array2[i] = i;
        }

        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= i;
            System.out.print(array2[i]);
            String mathSign = (i == len - 2) ? " = " : " * ";
            System.out.print(mathSign);
        }
        System.out.println(product);

        System.out.println("\n3. Удаление элементов массива");
        double[] array3 = new double[15];
        len = array3.length;
        for (int i = 0; i < len; i++) {
            array3[i] = Math.random();
        }
        System.out.println(printDoubleArray("Исходный массив: \n",array3));

        double middleCell = array3[(len - 1) / 2];
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (middleCell < array3[i]) {
                array3[i] = 0;
                counter++;
            }
        }

        System.out.println(printDoubleArray("Измененный массив: \n",array3));
        System.out.println("Количество обнуленных ячеек: " + counter);

        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] array4 = new char[26];
        for (int i = 65; i <= 90; i++) {
            array4[i - 65] = (char) i;
        }

        len = array4.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = array4[i];
            array4[i] = array4[len - i - 1];
            array4[len - i - 1] = temp;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j != i + 1) {
                    System.out.print(array4[j]);
                } else {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] array5 = new int[30];
        len = array5.length;
        for (int i = 0; i < len; i++) {
            int num = (int) (Math.random() * 40) + 60;
            while (findNum(array5, num)) {
                num = (int) (Math.random() * 40) + 60;
            }
            array5[i] = num;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < len - 1; i++) {
                if (array5[i] > array5[i + 1]) {
                    int temp = array5[i];
                    array5[i] = array5[i + 1];
                    array5[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.print(array5[i]);
                System.out.println();
            } else {
                System.out.print(array5[i] + ", ");
            }
        }
    }

    private static String printIntArray(String prefix, int[] array) {
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
        return result.toString();
    }

    private static String printDoubleArray(String prefix, double[] array) {
        StringBuilder result = new StringBuilder(prefix);
        len = array.length;
        for (int i = 0; i < len; i++) {
            String stringValue = Double.toString(array[i]);
            if (i == 7) {
                result.append(String.format("%.5s", stringValue)).append("\n");
            } else {
                result.append(String.format("%.5s ", stringValue));
            }
        }
        return result.toString();
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
