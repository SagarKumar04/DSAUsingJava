package InfinityJune21.OOPS.Polymorphism.RunTime;

class A {
    int i, j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k, l, m;

    B(int a, int b, int c, int d, int e) {
        super(a, b);
        k = c;
        l = d;
        m = e;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("m: " + m);
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        B b = new B(1, 2, 3, 4, 5);
        b.show();
    }
}
