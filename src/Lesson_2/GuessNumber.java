import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int hiddenNum = (int) (Math.random() * 100) + 1 ;
        do {
            divide();
            inputNumber(player1);
            if (isGuessed(player1, hiddenNum)) {
                break;
            }
            divide();
            inputNumber(player2);
        } while (!isGuessed(player2, hiddenNum));
    }

    private void inputNumber(Player player) {
        System.out.printf("%s, введите число от 1 до 100: ", player.getName());
        player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player, int hiddenNum) {
        if (player.getNumber() == hiddenNum) {
            System.out.printf("Игрок %s угадал число!!!\n", player.getName());
            return true;
        } else {
            if (player.getNumber() == -1) {
                System.out.println("Ввели неправильное число и ход переходит к другому игроку");
            } else if (player.getNumber() > hiddenNum) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", player.getNumber());
            } else if (player.getNumber() < hiddenNum) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getNumber());
            }
            return false;
        }
    }

    private void divide() {
        System.out.println("---------------------------------------------------------");
    }
}