public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(
                1,
                2020,
                "Red",
                "Toyota",
                25000000.00);

        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Color: " + myCar.getColor());
        System.out.println("Car Price: " + myCar.getPrice());

        myCar.carStart();
        myCar.turnOnHorn();
        myCar.pressBrake();
        myCar.carStop();
    }
}