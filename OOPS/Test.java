package InfinityJune21.OOPS;

class A {
    A() {
        System.out.println("In class A's constructor");
    }
}

class B extends A {
    B () {
        System.out.println("In class B's constructor");
    }
}

class C extends B {
    C () {
        System.out.println("In class C's constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        C c = new C();
    }
}