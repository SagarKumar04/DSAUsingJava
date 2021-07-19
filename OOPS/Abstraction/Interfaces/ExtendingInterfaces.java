package InfinityJune21.OOPS.Abstraction.Interfaces;

interface F {
    void method1();
    void method2();
}
interface G extends F {
    void method3();
}

public class ExtendingInterfaces implements G {
    @Override
    public void method1() {
        System.out.println("In method1()");
    }

    @Override
    public void method2() {
        System.out.println("In method2()");
    }

    @Override
    public void method3() {
        System.out.println("In method3()");
    }

    public static void main(String[] args) {
        ExtendingInterfaces e = new ExtendingInterfaces();
        e.method1();
        e.method2();
        e.method3();
    }
}
