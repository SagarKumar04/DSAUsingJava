package InfinityJune21.String;

import java.util.Scanner;

public class BasicsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println("String: " + s);

        //Calculate length of the string
        int length = s.length();
        System.out.println("Length: " + length);

        //Concatenation
        String s1 = " is interesting";
        String concatenatedString = s + s1;
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
