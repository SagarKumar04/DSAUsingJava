package InfinityJune21.BasicMaths.EulerTotient;

public class EulerTotientExample1 {
    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int n = 6, count = 0;

        for(int i = 1; i <= n; i++) {
            int gcd = gcd(n, i);

            if(gcd == 1) {
                count++;
            }
        }

        System.out.println("Value: " + count);
    }
}
