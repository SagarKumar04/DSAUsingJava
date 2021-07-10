package InfinityJune21.DoubtSessionFunctionsJuly10.StaticAndNonStatic;

public class StaticAndNonStaticExample {
    int num1;
    int num2;
    static int sum;

    int sum() {
        sum = num1 + num2;

        return sum;
    }

    static void display(int value) {
        System.out.println("Value is: " + value);
    }

    public static void main(String[] args) {
        StaticAndNonStaticExample s1 = new StaticAndNonStaticExample();
        StaticAndNonStaticExample s2 = new StaticAndNonStaticExample();

        s1.num1 = 10;
        s1.num2 = 20;
        s1.sum();
        display(sum);

        s2.num1 = 30;
        s2.num2 = 40;
        s2.sum();
        display(sum);
    }
}