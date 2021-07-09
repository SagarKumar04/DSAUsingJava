package InfinityJune21.String;

public class RemoveRepeatedStringCaseInsensitive {
    public static void main(String[] args) {
        String originalString = "helloworld";
        String lowerCaseString = originalString.toLowerCase();
        int length = lowerCaseString.length();
        String answer = "";
        int arr[] = new int[26];

        for(int i = 0; i < length; i++) {
            char ch = lowerCaseString.charAt(i);
            int index = ch - 97;
            System.out.println(ch + " " + (int)ch + " " + index);
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
