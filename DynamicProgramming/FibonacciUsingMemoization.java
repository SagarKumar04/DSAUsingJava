package InfinityJune21.DynamicProgramming;

public class FibonacciUsingMemoization {
    final static int SIZE = 200;
    static int lookup[] = new int[SIZE];

    static void initialize() {
        for(int i = 0; i < SIZE; i++) {
            lookup[i] = -1;
        }
    }

    static int fibonacci(int n) {
        if(lookup[n] == -1) {
            if(n == 1) {
                lookup[1] = 0;
            }
            else if(n == 2) {
                lookup[2] = 1;
            }
            else {
                lookup[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        return lookup[n];
    }

    public static void main(String[] args) {
        initialize();

        int n = 9;
        //0, 1, 1, 2, 3, 5, 8, 13, ...
        int result = fibonacci(n);

        System.out.println(result);
    }
}
