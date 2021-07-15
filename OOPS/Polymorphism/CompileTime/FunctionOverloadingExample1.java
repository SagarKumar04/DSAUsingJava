package InfinityJune21.OOPS.Polymorphism.CompileTime;

public class FunctionOverloadingExample1 {
    void fun() {
        System.out.println("In fun: ");
    }

    void fun(int a) {
        System.out.println("In fun: a: " + a);
    }

    int fun(int a, int b) {
        return a;
        //return b; -> unreachable statement
    }

    public static void main(String[] args) {
        FunctionOverloadingExample1 f = new FunctionOverloadingExample1();
        f.fun();
        f.fun(1);
        f.fun(10, 20);
    }
}
