package InfinityJune21.ExceptionHandlingExamples;

public class NotHandlingExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        System.out.println("In line 7");
        int result = num1 / num2; //will throw exception
        System.out.println("In line 9");
        System.out.println(result);
    }
}
