package InfinityJune21.OOPS.Abstraction.Interfaces;

interface C {
    void display();
    void show();
}

class D implements C {
    @Override
    public void display() {
        System.out.println("In class D's display()");
    }

    @Override
    public void show() {
        System.out.println("In class D's show()");
    }

    void print() {
        System.out.println("In class D's print()");
    }
}

class E implements C {
    @Override
    public void display() {
        System.out.println("In class E's display()");
    }

    @Override
    public void show() {
        System.out.println("In class E's show()");
    }

    void print() {
        System.out.println("In class E's print()");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        C c = new D();
        E e = new E();

        c.display();
        c.show();
        new D().print();

        c = e;

        c.display();
        c.show();
        e.print();
    }
}
