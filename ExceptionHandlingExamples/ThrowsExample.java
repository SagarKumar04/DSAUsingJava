package InfinityJune21.ExceptionHandlingExamples;

public class ThrowsExample {
    static int divide(int num1, int num2) throws Exception {
        int result;

        try {
            result = num1 / num2;
        }
        catch(Exception e) {
            System.out.println("Inside divide(): " + e);
            throw new Exception("Divide by zero");
        }

        return result;
    }
    public static void main(String[] args) {
        int result = 0;

        try {
            result = divide(5, 0);
        }
        catch (Exception e) {
            System.out.println("Caught inside main: " + e);
        }
        System.out.println("Result: " + result);
    }
}
