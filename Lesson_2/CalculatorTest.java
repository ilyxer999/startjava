import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            calculator.setA(console.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(console.nextInt());
            calculator.calculate();
            calculator.printResult();
            while(true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String exit = console.next();
                if (exit.equals("no")) {
                    return;
                }
                if (exit.equals("yes")) {
                    break;
                }
            }
        }
    }
}