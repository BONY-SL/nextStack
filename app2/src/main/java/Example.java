import java.util.Arrays;
public class Example {


    public static void main(String[] args) {

        int arr[]={10,20,30,50,40,90,80};
        printArr(arr);

    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}