public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = 67;
        int playerNum = 54;
        if (computerNum > 100 || computerNum < 1) {
            System.out.println("Измените число, которое необходимо отгадать");
        } else {
            while (computerNum != playerNum) {
                if (playerNum > computerNum) {
                    System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
                } else {
                    System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNum);
                }
                if (playerNum < computerNum) {
                    playerNum += 5;
                } else {
                    playerNum -=3;
                }
            }
        }
        System.out.println("Вы победили!");
    }
}