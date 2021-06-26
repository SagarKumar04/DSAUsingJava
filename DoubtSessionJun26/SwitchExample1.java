package InfinityJune21.DoubtSessionJun26;

public class SwitchExample1 {
    public static void main(String[] args) {
        /*
        1 - add
        2 - subtract
        3 - multiply
        4 - divide
         */
        int choice = 1;
        int num1 = 10, num2 = 20, result = 0;
        switch(choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Case 1");
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Case 2");
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Case 3");
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Case 4");
                break;
            default:
                result = 0;
        }

        System.out.println("Result: " + result);
    }
}
