package InfinityJune21.BasicMaths.BooleanAlgebra;

public class NumberOf1s {
    public static void main(String[] args) {
        int n = 31; //11111
        int count = 0;

        while(n != 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Count is: " + count);
    }
}
