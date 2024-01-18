public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger("mark-2", 90.3, 2);

        jaeger1.setMark("mark-1");
        jaeger1.setHeight(85.5);
        jaeger1.setPilotsNum(2);

        jaeger1.printInfo();
        jaeger1.drift(true);
        jaeger1.goAhead();
        jaeger1.killKaiju();

        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getHeight());
        System.out.println(jaeger1.getPilotsNum());

        jaeger2.printInfo();
        jaeger1.drift(false);
        jaeger1.goAhead();
        jaeger1.killKaiju();
        jaeger2.setMark("mark-3");
        jaeger2.setHeight(93.2);
        jaeger2.setPilotsNum(1);

        System.out.println(jaeger2.getMark());
        System.out.println(jaeger2.getHeight());
        System.out.println(jaeger2.getPilotsNum());
    }
}