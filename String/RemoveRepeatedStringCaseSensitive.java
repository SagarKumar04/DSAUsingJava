package InfinityJune21.String;

public class RemoveRepeatedStringCaseSensitive {
    public static void main(String[] args) {
        String originalString = "helloWOrld";
        int length = originalString.length();
        String answer = "";
        int arr[] = new int[52];

        for(int i = 0; i < length; i++) {
            char ch = originalString.charAt(i);
            int index;
            if(ch >= 97 && ch <=122) {
                index = ch - 97;
                //a - 0, b - 1, c - 2, d - 3, ...., z - 25
            }
            else if(ch >= 65 && ch <= 90) {
                index = (ch - 65) + 26;
                //A - 26, B - 27, C - 28, D - 29, ...., Z - 51
            }
            else {
                index = -1;
            }

            int frequency = arr[index];
            if(frequency == 0) {
                answer = answer + ch;
                arr[index] = 1;
            }
            else {
                arr[index] = frequency + 1;
            }
        }

        System.out.println(answer);
    }
}
