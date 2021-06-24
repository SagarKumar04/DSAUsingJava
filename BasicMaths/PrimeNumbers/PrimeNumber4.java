package InfinityJune21.BasicMaths.PrimeNumbers;

public class PrimeNumber4 {
    public static void main(String[] args) {
        int n = 1000001;
        int squareRoot = (int)Math.sqrt(n);
        int count = 0;

        long startTime = System.nanoTime();
        if(n == 2) {
            count = 0;
        }
        else if(n % 2 == 0) {
            count = 1;
        }
        else {
            for(int i = 3; i <= squareRoot; i+=2) {
                if(n % i == 0) {
                    count++;
                }
            }
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total Time: " + totalTime);

        if(count == 0) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Composite Number");
        }
    }
}
