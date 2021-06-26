package InfinityJune21.DoubtSessionJun26;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);

        int num1 = 10, num2 = 20, result = 0;
        switch(choice) {
            case '+':
                result = num1 + num2;
                System.out.println("Case 1");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Case 2");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Case 3");
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Case 4");
                break;
            default:
                result = 0;
        }

        System.out.println("Result: " + result);
    }
}
