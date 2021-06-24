package InfinityJune21.BasicMaths.Divisors;

public class GreatestCommonDivisor {
    static int gcd(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
    public static void main(String[] args) {
        int num1 = 360;
        int num2 = 48;

        int gcd = gcd(num1, num2);

        System.out.println(gcd);
    }
}
