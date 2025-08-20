public class Demo {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3, 4, 5));
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

    public static int calculate(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
