package InfinityJune21.BasicMaths.Divisors;

public class DivisorNTime {
    public static void main(String[] args) {
        int n = 36;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
