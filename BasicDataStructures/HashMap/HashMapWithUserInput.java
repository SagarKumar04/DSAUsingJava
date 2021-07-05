package InfinityJune21.BasicDataStructures.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapWithUserInput {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
        boolean condition = true;

        while(condition) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the batch name: ");
            String batchName = scanner.nextLine();

            System.out.println("Enter marks of the student");
            int marksOfStudent = scanner.nextInt();

            boolean isKeyPresent = hashMap.containsKey(batchName);

            ArrayList<Integer> marks;
            if(isKeyPresent) {
                marks = hashMap.get(batchName);
            }
            else {
                marks = new ArrayList<>();
            }
            marks.add(marksOfStudent);
            hashMap.put(batchName, marks);

            System.out.println("Current hashMap: ");
            System.out.println(hashMap);

            System.out.println("Do you want to continue? (Y/N)");
            char choice = scanner.next().charAt(0);

            if(choice == 'N' || choice == 'n') {
                condition = false;
            }
        }
    }
}
