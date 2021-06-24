package InfinityJune21.BasicMaths.Divisors;

public class DivisorSqrtNTimeUnsorted {
    public static void main(String[] args) {
        int n = 36, squareRoot = (int)Math.sqrt(n);

        for(int i = 1; i <= squareRoot; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                int secondDivisor = n / i;

                if(i != secondDivisor) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}
