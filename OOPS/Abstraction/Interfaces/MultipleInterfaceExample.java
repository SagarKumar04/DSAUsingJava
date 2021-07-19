package InfinityJune21.OOPS.Abstraction.Interfaces;

interface H {
    void display1();
}

interface I {
    void display2();
}

class Test implements H, I {
    @Override
    public void display1() {
        System.out.println("In display1() method");
    }

    @Override
    public void display2() {
        System.out.println("In display2() method");
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Test t = new Test();
        t.display1();
        t.display2();
    }
}
