package InfinityJune21.BasicMaths.BigIntegerExample;

import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1, num2;
        //int num1, num2;

        String num1String = scanner.nextLine();
        String num2String = scanner.nextLine();

        num1 = new BigInteger(num1String);
        num2 = new BigInteger(num2String);

        BigInteger sum = num1.add(num2);
        BigInteger diff = num1.subtract(num2);
        BigInteger mult = num1.multiply(num2);
        BigInteger div = num1.divide(num2);
        BigInteger mod = num1.remainder(num2);

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(mod);
    }
}
