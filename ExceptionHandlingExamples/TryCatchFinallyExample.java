package InfinityJune21.ExceptionHandlingExamples;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        float result = 0;

        try {
            result = num1 / num2;
        }
        catch(Exception e) {
            System.out.println("e: " + e);
        }
        finally {
            System.out.println("Inside finally");
            System.out.println("Result: " + result);
        }
    }
}
