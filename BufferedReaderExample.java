package InfinityJune21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter a number: ");
        int num = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Number entered is: " + num);
    }
}
