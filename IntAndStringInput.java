package InfinityJune21;

import java.util.Scanner;

public class IntAndStringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("Integer: " + i);
        System.out.println("String: " + s);
    }
}
