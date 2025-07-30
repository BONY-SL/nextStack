import java.util.Arrays;
import java.util.Random;
 class Car {

    private int carId;private int manufactYear;
    private String color;private String model;
    private double price;

    public Car(){}

    public Car(int carId, int manufactYear, String color, String model, double price) {
        this.carId = carId;this.manufactYear = manufactYear;
        this.color = color;this.model = model;
        this.price = price;
    }
     public int getCarId() {return carId;}
     public void setCarId(int carId) {this.carId = carId;}
     public int getManufactYear() {return manufactYear;}
     public void setManufactYear(int manufactYear) {this.manufactYear = manufactYear;}
     public String getColor() {return color;}
     public void setColor(String color) {this.color = color;}
     public String getModel() {return model;}
     public void setModel(String model) {this.model = model;}
     public double getPrice() {return price;}
     public void setPrice(double price) {this.price = price;}
     public void carStart() {System.out.println("Car Start......");}
     public void carStop() {System.out.println("Car Stop.......");}
     public void turnOnHorn() {System.out.println("Peep Peep.......");}
     public void pressBrake() {System.out.println("Braking.......");}
}









































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
