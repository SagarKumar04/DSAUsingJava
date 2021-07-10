package InfinityJune21.DoubtSessionFunctionsJuly10.StaticAndNonStatic;

public class StaticExample {
    static int num1;
    static int num2;

    static void sum() {
        num1 = 10;
        num2 = 25;
        int sum = num1 + num2;

        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        sum();
        num1 = 20;
        num2 = 40;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
