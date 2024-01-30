package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] array1 = {1, 7, 4, 5, 2, 6, 3};
        int[] arrayReversed1 = new int[array1.length];
        int indexReverse = array1.length - 1;
        for (int i = 0; i < array1.length; i++) {
            arrayReversed1[i] = array1[indexReverse];
            indexReverse--;
        }
        System.out.println(printIntArray("До реверса: ", array1));
        System.out.println(printIntArray("После реверса: ", arrayReversed1));

        System.out.println("\n2. Произведение элементов массива");
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }

        int product = 1;
        for (int i = 1; i < array2.length - 1; i++) {
            product *= i;
            System.out.print(array2[i]);
            String a = (i == array2.length - 2) ? " = " : " * ";
            System.out.print(a);
        }
        System.out.println(product);

        System.out.println("\n3. Удаление элементов массива");
        double[] array3 = new double[15];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.random();
        }

        double middleCell = array3[(array3.length - 1) / 2];
        double[] modifiedArray3 = new double[array3.length];
        int counter = 0;
        for (int i = 0; i < array3.length; i++) {
            if (middleCell < array3[i]) {
                modifiedArray3[i] = 0;
                counter++;
            } else {
                modifiedArray3[i] = array3[i];
            }
        }

        System.out.println(printDoubleArray("Исходный массив: \n",array3));
        System.out.println(printDoubleArray("Измененный массив: \n",modifiedArray3));
        System.out.println("Количество обнуленных ячеек: " + counter);

        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] array4 = new char[26];
        int indexArray4 = 0;
        for (int i = 65; i <= 90; i++) {
            array4[indexArray4] = (char) i;
            indexArray4++;
        }

        char[] arrayReversed4 = new char[array4.length];
        indexReverse = array4.length - 1;
        for (int i = 0; i < arrayReversed4.length; i++) {
            arrayReversed4[i] = array4[indexReverse];
            indexReverse--;
        }

        for (int i = 0; i < arrayReversed4.length; i++) {
            for (int j = 0; j < arrayReversed4.length; j++) {
                if (j != i + 1) {
                    System.out.print(arrayReversed4[j]);
                } else {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] array5 = new int[30];
        for (int i = 0; i < array5.length; i++) {
            int num = (int) (Math.random() * 40) + 60;
            while (findNum(array5, num)) {
                num = (int) (Math.random() * 40) + 60;
            }
            array5[i] = num;
        }

        counter = 0;
        while (counter < array5.length) {
            for (int i = 1; i < array5.length; i++) {
                int a = array5[i - 1];
                int b = array5[i];
                if (a > b) {
                    array5[i]  = a;
                    array5[i - 1] = b;
                }
            }
            counter++;
        }

        counter = 1;
        for (int i: array5) {
            if (counter % 10 == 0) {
                System.out.print(i);
                System.out.println();
            } else {
                System.out.print(i + ", ");
            }
            counter++;
        }
    }

    private static String printIntArray(String prefix, int[] array) {
        StringBuilder result = new StringBuilder(prefix + "[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i == array.length - 1) {
                result.append("]");
            } else {
                result.append(", ");
            }
        }
        return result.toString();
    }

    private static String printDoubleArray(String prefix, double[] array) {
        StringBuilder result = new StringBuilder(prefix);
        for (int i = 0; i < array.length; i++) {
            String string = Double.toString(array[i]);
            if (i == 7) {
                result.append(String.format("%.5s", string)).append("\n");
            } else {
                result.append(String.format("%.5s ", string));
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
