package InfinityJune21.BasicMaths.BigIntegerExample;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1, num2;

        String num1String = scanner.nextLine();
        String num2String = scanner.nextLine();

        num1 = new BigInteger(num1String);
        num2 = new BigInteger(num2String);

        System.out.println(num1.compareTo(num2));

        if(num1.compareTo(num2) < 0) {
            System.out.println(num1 + " is smaller");;
        }
        else if(num1.compareTo(num2) > 0) {
            System.out.println(num1 + " is greater");
        }
        else if(num1.compareTo(num2) == 0) {
            System.out.println("Both are equal");
        }
        else {

        }
    }
}
