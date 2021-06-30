package InfinityJune21.BasicMaths.BooleanAlgebra;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 128;

        int result = n & (n - 1);

        if(result == 0) {
            System.out.println("Power of 2");
        }
        else {
            System.out.println("Not a power of 2");
        }
    }
}
