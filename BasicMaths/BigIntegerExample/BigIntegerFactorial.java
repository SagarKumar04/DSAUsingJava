package InfinityJune21.BasicMaths.BigIntegerExample;

import java.math.BigInteger;

public class BigIntegerFactorial {
    static BigInteger factorial(int num) {
        BigInteger f = new BigInteger("1");

        for(int i = 1; i <= num; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            f = f.multiply(bigI);
        }

        return f;
    }
    public static void main(String[] args) {
        int num = 100;
        System.out.println(factorial(num));
    }
}
