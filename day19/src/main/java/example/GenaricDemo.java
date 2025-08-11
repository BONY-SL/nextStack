package example;

import java.util.Arrays;

/**
 * This class demonstrates the use of generics in Java.
 * It is currently empty and serves as a placeholder for future code.
 */

interface Cricketers{

}

class Batsman implements Cricketers {
    // Batsman-specific properties and methods
    String name;
    public Batsman(String name) {
        this.name = name;
    }
}

class Baller implements Cricketers {
    // Baller-specific properties and methods
    String name;
    public Baller(String name) {
        this.name = name;
    }
}

class Slc <T>{
    Object [] team = new Object[11];
    int count = 0;
    public void add(T t) {
        if (count < team.length) {
            team[count++] = t;
        } else {
            System.out.println("Team is full");
        }
    }

    public void display() {

        System.out.println(Arrays.toString(team));
    }
}

public class GenaricDemo {
    public static void main(String[] args) {


        Cricketers batsman1 = new Batsman("Sachin Tendulkar");
        Cricketers batsman2 = new Batsman("Virat Kohli");

        Cricketers baller1 = new Baller("Brett Lee");
        Cricketers baller2 = new Baller("Shane Warne");

        Slc<Cricketers> team = new Slc<>();
        team.add(batsman1);
        team.add(batsman2);
        team.add(baller1);
        team.add(baller2);
        team.display();

    }
}
