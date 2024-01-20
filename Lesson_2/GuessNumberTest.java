import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        String exit;

        do {
            GuessNumber game = new GuessNumber(name1, name2);
            game.startGame();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                exit = scanner.next();
            } while(!exit.equals("no") && !exit.equals("yes"));
        } while (!exit.equals("no"));
    }
}