package InfinityJune21.ExceptionHandlingExamples;

public class ExceptionHandling {
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
        System.out.println("Result: " + result);
    }
}