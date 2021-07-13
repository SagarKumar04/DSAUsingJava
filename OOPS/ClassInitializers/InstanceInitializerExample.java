package InfinityJune21.OOPS.ClassInitializers;

public class InstanceInitializerExample {
    int a;

    //constructor
    InstanceInitializerExample() {
        System.out.println("a: " + a);
        a = 10;
        System.out.println("a: " + a);
    }

    //instance initializer
    {
        System.out.println("In instance initializers");
        a = 100;
    }

    public static void main(String[] args) {
        System.out.println("In main(), before object");
        System.out.println("In main(), before object");
        System.out.println("In main(), before object");
        System.out.println("In main(), before object");
        InstanceInitializerExample i = new InstanceInitializerExample();
        System.out.println("In main(), after object");
    }
}
