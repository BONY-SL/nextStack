public class FactorialDemo {
    public static void main(String[] args) {
        m1();
        System.out.println("main");
    }

    private static void m1() {
        System.out.println("m1");
        m2();
    }

    private static void m2() {
        System.out.println("m2");
    }
}
