package InfinityJune21.BasicMaths;

import com.sun.security.jgss.GSSUtil;

public class Factorial {
    public static void main(String[] args) {
        int num = 100;
        long factorial = 1;
        int modulo = 1000000007;

        for(int i = 1; i <= num; i++) {
            System.out.println(factorial);
            factorial = (factorial % modulo) * i;
        }

        System.out.println("Factorial is: " + factorial);
    }
}
