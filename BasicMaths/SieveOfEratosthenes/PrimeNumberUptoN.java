package InfinityJune21.BasicMaths.SieveOfEratosthenes;

public class PrimeNumberUptoN {
    static void getPrimeNumbersUptoN(int n) {
        boolean prime[] = new boolean[n + 1];

        for(int i = 0; i < (n + 1); i++) {
            prime[i] = true;
        }
        for(int p = 2; p * p <= n; p++) {
            if(prime[p] == true) {
                for(int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(prime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 30;

        System.out.println("Prime Numbers upto " + n);
        getPrimeNumbersUptoN(n);
    }
}
