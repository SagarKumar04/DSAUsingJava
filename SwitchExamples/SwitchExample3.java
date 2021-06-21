package InfinityJune21.SwitchExamples;

import java.util.Scanner;

public class SwitchExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
                //break;
            case 3:
                System.out.println("Three");
                //break;
            case 4:
                System.out.println("Four");
                //break;
            default:
                System.out.println("Wrong input");
        }
    }
}