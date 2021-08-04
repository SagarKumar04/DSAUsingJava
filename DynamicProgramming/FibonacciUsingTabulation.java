package InfinityJune21.DynamicProgramming;

public class FibonacciUsingTabulation {
    static int fibonacci(int n) {
        int lookup[] = new int[n + 1];
        lookup[1] = 0;
        lookup[2] = 1;

        for(int i = 3; i <= n; i++) {
            lookup[i] = lookup[i - 1] + lookup[i - 2];
        }

        return lookup[n];
    }

    public static void main(String[] args) {
        int result = fibonacci(8);
        System.out.println(result);
    }
}
