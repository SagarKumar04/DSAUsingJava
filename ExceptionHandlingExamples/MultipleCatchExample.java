package InfinityJune21.ExceptionHandlingExamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int length = arr.length;
        int sum = 0;
        int average = 0;

        try {
            sum = 0;
            for(int i = 0; i < length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Sum: " + sum);

            average = sum / length;

            arr[9] = 100;
        }
        catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException aie) {
            aie.printStackTrace();
        }
        System.out.println("Average: " + average);
    }
}
