package InfinityJune21.DoubtSessionJuly24;

public class SumOfGCD {
    static int getCount(int d, int n) {
        int no = n / d;
        int result = no;

        for(int p = 2; p * p <= no; p++) {
            if(no % p == 0) {
                while(no % p == 0) {
                    no = no / p;
                }
                result = result - (result / p);
            }
        }

        if(no > 1) {
            result = result - (result / no);
        }

        return result;
    }

    static int getSumOfGCDOfPairs(int n) {
        int result = 0;

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                int d1 = i;
                int d2 = n / i;

                result = result + (d1 * getCount(d1, n));

                if(d1 != d2) {
                    result = result + (d2 * getCount(d2, n));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6546;
        int sum = 0;

        sum = getSumOfGCDOfPairs(n);
        System.out.println("Sum is: " + sum);
    }
}
