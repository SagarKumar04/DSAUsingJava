package InfinityJune21.DivideAndConquer;

public class OptimisedPowerCalculation {
    static int power(int x, int y) {
        if(y == 0) {
            return 1;
        }

        int temp = power(x, y / 2);
        if(y % 2 == 0) {
            return (temp * temp);
        }
        else {
            return (x * temp * temp);
        }
    }

    public static void main(String[] args) {
        int x = 8;
        int y = 3;

        int xPowerY = power(x, y);

        System.out.println(xPowerY);
    }
}
