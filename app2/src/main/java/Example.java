import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);



        List<String> syncList = Collections.synchronizedList(new ArrayList<>());


    }

    void printCollection(Collection<String> collection) {
        for (String item : collection) {
            System.out.println(item);
        }
    }


}