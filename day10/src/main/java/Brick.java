public class Brick {
    private int x;
    private int y;

    public Brick() {
    }

    public Brick(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getSize(){
        return x*y;
    }

    @Override
    public String toString() {
        return "Brick{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] args) {
        Brick b1 = new Brick();
        b1.setSize(8,8);
        System.out.println(b1.getSize());
    }
}
