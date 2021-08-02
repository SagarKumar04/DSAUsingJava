package InfinityJune21.DivideAndConquer;

public class PowerCalculation {
    static int power(int x, int y) {
        if(y == 0) {
            return 1;
        }
        else if(y % 2 == 0) {
            return (power(x, y / 2) * power(x, y / 2));
        }
        else {
            return (x * power(x, y / 2) * power(x, y / 2));
        }
    }

    public static void main(String[] args) {
        int x = 8;
        int y = 3;

        int xPowerY = power(x, y);

        System.out.println(xPowerY);
    }
}
