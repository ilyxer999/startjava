import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);
    private boolean isWin;
    
    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void startGame() {
        int computerNum = (int) (Math.random() * 100) + 1 ;

        while (!isWin) {
            divide();
            inputNumber(player1);
            printResultMove(player1, computerNum);
            if (isWin) {
                break;
            }

            divide();
            inputNumber(player2);
            printResultMove(player2, computerNum);
        }
    }

    private void inputNumber(Player player) {
        System.out.printf("%s, введите число от 1 до 100: ", player.getName());
        player.setNumber(scanner.nextInt());
    }

    private void printResultMove(Player player, int computerNum) {
        if (player.getNumber() == 0) {
            System.out.println("Ввели неправильное число и ход переходит к другому игроку");
        } else if (player.getNumber() == computerNum) {
            System.out.printf("Игрок %s угадал число\n", player.getName());
            this.isWin = true;
        } else if (player.getNumber() > computerNum) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", player.getNumber());
        } else if (player.getNumber() < computerNum) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getNumber());
        }
    }

    private void divide() {
        System.out.println("---------------------------------------------------------");
    }
}