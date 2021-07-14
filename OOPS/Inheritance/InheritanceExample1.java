package InfinityJune21.OOPS.Inheritance;

class A {
    int i, j;

    void showij() {
        System.out.println("Values of i and j are: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("Values of k: " + k);
    }

    void sum() {
        System.out.println("Sum of i, j, and k is: " + (i + j + k));
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 70;
        subOb.j = 80;
        subOb.k = 90;

        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        subOb.sum();

        System.out.println("Value of i in superOb: " + superOb.i);
    }
}