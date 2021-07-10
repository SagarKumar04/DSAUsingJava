package InfinityJune21.DoubtSessionFunctionsJuly10.ReturnTypeParameterListExamples;

public class ParametersAndReturnType {
    static int sum(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2= 25;

        int sum = sum(num1, num2);

        System.out.println("Sum is: " + sum);
    }
}
