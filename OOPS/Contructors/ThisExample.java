package InfinityJune21.OOPS.Contructors;

public class ThisExample {
    int a, b;

    ThisExample(int x, int y) {
        this.a = x;
        this.b = y;
    }

    void display() {
        System.out.println("a: " + a + "\n" + "b: " + b);
    }

    public static void main(String[] args) {
        ThisExample t = new ThisExample(100, 200);
        t.display();
    }
}
