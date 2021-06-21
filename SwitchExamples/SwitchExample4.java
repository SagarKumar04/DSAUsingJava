package InfinityJune21.SwitchExamples;

import java.util.Scanner;

public class SwitchExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit (Enter -1 to exit)");
        System.out.println("Enter the choice: ");
        int choice = scanner.nextInt();

        while(choice != -1) {
        //for(int i = 0; choice != -1; i++) {
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            int result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
                    break;
            }

            System.out.println("Result: " + result);

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit (Enter -1 to exit)");
            System.out.println("Enter the choice: ");
            choice = scanner.nextInt();
        }
        scanner.close();
    }
}
