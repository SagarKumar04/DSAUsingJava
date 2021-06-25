package InfinityJune21.BasicMaths.Sequence;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 12;
        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;

        for(int i = 2; i <= n; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
