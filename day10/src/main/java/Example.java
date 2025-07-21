import java.util.Arrays;
import java.util.Random;

public class Example {
    int x;
    public static void main(String[] args) {

        int [] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("========================");

        Example e = new Example();
        System.out.println(e.x);

        for (int num : array){
            System.out.println(num);
        }
    }
}
