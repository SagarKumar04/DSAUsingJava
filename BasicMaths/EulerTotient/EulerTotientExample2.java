package InfinityJune21.BasicMaths.EulerTotient;

public class EulerTotientExample2 {
    public static void main(String[] args) {
        int n = 6;
        float result = n;

        for(int p = 2; p * p <= n; p++) {
            if(n % p == 0) {
                while(n % p == 0) {
                    n = n / p;
                }
                result = result * (1.0f - (1.0f / (float)p));
            }
        }

        if(n > 1) {
            result = result * (1.0f - (1.0f / (float)n));
        }

        System.out.println("Result: " + result);
    }
}
