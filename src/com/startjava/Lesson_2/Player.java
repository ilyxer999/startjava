public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0 && number <= 100) {
            this.number = number;
        } else {
            this.number = -1;
        }
    }
}