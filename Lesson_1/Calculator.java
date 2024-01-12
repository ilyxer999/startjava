public class Calculator {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        char sign = '=';
        int result = 0;
        if (a < 1 || b < 1) {
            System.out.println("Введенные числа должны быть положительными!");
            return;
        } else if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            double divisionResult = (double) a / b;
            System.out.println(a + " " + sign + " " + b + " = " + divisionResult);
            return;
        } else if (sign == '^') {
            result = a;
            for (int i = 2; i <= b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Введенный знак не поддерживается калькулятором!");
            return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}