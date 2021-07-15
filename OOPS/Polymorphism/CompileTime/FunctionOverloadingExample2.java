package InfinityJune21.OOPS.Polymorphism.CompileTime;

public class FunctionOverloadingExample2 {
    static void print(int a, float b) {
        System.out.println("In print(int, int): a: " + a + " b: " + b);
    }

    static void print(float a, int b) {
        System.out.println("In print(float, float): a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        print(1, 2.5f);
        print(1.5f, 2);

        //print(10, 10); -> ambiguous function call
    }
}
