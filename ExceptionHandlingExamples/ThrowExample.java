package InfinityJune21.ExceptionHandlingExamples;

public class ThrowExample {
    static int divide(int num1, int num2) {
        int result = 0;

        try {
            result = num1 / num2;
        }
        catch(Exception e) {
            System.out.println("Inside divide(): " + e);
        }

        return result;
    }
    public static void main(String[] args) {
        int result = 0;

        try {
            result = divide(5, 0);
        }
        catch (Exception e) {
            System.out.println("Inside main(): " + e);
        }
        System.out.println("Result: " + result);
    }
}