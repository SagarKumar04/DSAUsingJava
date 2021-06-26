package InfinityJune21.DoubtSessionJun26;

public class NestedIfExample {
    public static void main(String[] args) {
        int num = 100;

        if(num > 0) {
            if(num > 50) {
                System.out.println("Positive and above 50");
            }
            else {
                System.out.println("Positive and below 50");
            }
        }
        else {
            System.out.println("Negative Number");
        }
    }
}
