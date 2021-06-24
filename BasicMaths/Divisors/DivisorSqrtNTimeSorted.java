package InfinityJune21.BasicMaths.Divisors;

public class DivisorSqrtNTimeSorted {
    public static void main(String[] args) {
        int n = 36, squareRoot = (int)Math.sqrt(n);

        for(int i = 1; i <= squareRoot; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for(int i = squareRoot - 1; i >= 1; i--) {
            if(n % i == 0) {
                System.out.print((n / i) + " ");
            }
        }
        System.out.println();
    }
}
