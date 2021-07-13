package InfinityJune21.OOPS.Encapsulation;

public class TestClass {
    public static void main(String[] args) {
        PrivateAccessExample p = new PrivateAccessExample();

        p.setA(10);
        int a = p.getA();
        System.out.println("a: " + a);

        p.d = 10;
        float d = p.d;
        System.out.println("d: " + d);
    }
}
