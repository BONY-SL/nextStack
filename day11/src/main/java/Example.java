
class A{
    A(){

        System.out.println("(Super Default)");
    }
    A(int a){
        System.out.println("A(int a )");
    }
    A(int a,int b){
        System.out.println("A(int a,int b)");
    }
    A(int a,int b,int c){
        System.out.println("A(int a,int b,int c)");//overloading
    }
}
class B extends A{
    int b;
    B(){
        super(10);
        System.out.println("B()");
    }
    B(int b){
        System.out.println("B(int a)");
    }
    B(int a,int b){
        System.out.println("B(int a,int b)");
    }
    B(int a,int b,int c){
        System.out.println("B(int a,int b,int c)");
    }
}
public class Example{

    int a;
    Example(){
    }
    public static void main(String[] args) {
        new B();
        System.out.println("*******");

        new B(10);
        System.out.println("*******");

        new B(10,20,30);
    }
}