package InfinityJune21.OOPS.Abstraction.Interfaces;

interface A {
    void display();
    void show();
}

class B implements A {
    @Override
    public void display() {
        System.out.println("In class B's display()");
    }

    @Override
    public void show() {
        System.out.println("In class B's show()");
    }

    void print() {
        System.out.println("In class B's print()");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.print();
        b.show();
    }
}
