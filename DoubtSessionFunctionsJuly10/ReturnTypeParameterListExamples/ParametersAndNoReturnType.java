package InfinityJune21.DoubtSessionFunctionsJuly10.ReturnTypeParameterListExamples;

public class ParametersAndNoReturnType {
    static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;

        sum(num1, num2);
    }
}
