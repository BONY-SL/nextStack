import java.util.ArrayList;

class PrintInfo <T>{
    T data;

    public PrintInfo(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println("Data value: " + data);
        System.out.println(data.getClass().getName());
    }
}

class Animal{
    public void sound(){
        System.out.println("Animal sound");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class DataSet<T extends Animal>{
    Object [] bucket=new Object[10];
    int count=0;
    DataSet(T t){
        bucket[count++]=t;
    }
}


public class Demo {
    public static void main(String[] args) {


        Integer integer = 100;
        PrintInfo<Integer> printInfo = new PrintInfo<>(integer);
        printInfo.print();


        Double doubleValue = 99.99;
        PrintInfo<Double> printInfoDouble = new PrintInfo<>(doubleValue);
        printInfoDouble.print();


        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        dataList.add(2);

        System.out.println(dataList);

        DataSet <Cat> d=new DataSet<>(new Cat());
        DataSet <Dog> c=new DataSet<>(new Dog());

    }
}
