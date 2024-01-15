public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Волчица";
        wolf.name = "Ракше";
        wolf.weight = 25.5;
        wolf.age = 3;
        wolf.color = "Серый";

        System.out.println("пол: " + wolf.gender);
        System.out.println("кличка: " + wolf.name);
        System.out.println("вес: " + wolf.weight);
        System.out.println("возраст: " + wolf.age);
        System.out.println("окрас: " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}