class Parent{
    public void greeting(){
        System.out.println("hello world");
    }
}
class SayHiClass extends Parent implements Runnable {
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
class SayHelloClass extends Parent  implements Runnable {
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
public class SayHey {
    public static void main(String[] args) {
        SayHiClass sayHi=new SayHiClass();
        SayHelloClass sayHello=new SayHelloClass();

        Thread t1=new Thread(sayHi);
        Thread t2=new Thread(sayHello);
        t1.start();
        t2.start();
    }
}