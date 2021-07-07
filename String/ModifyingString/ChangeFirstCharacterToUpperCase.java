package InfinityJune21.String.ModifyingString;

public class ChangeFirstCharacterToUpperCase {
    public static void main(String[] args) {
        String s1 = "UpperCASe LowerCASE COMBO";
        String s2 = s1.charAt(0) + "";
        String s2UpperCase = s2.toUpperCase();
        String s3 = s1.substring(1);
        String s3LowerCase = s3.toLowerCase();

        String answer = s2UpperCase.concat(s3LowerCase);
        System.out.println(answer);


        answer = (s1.charAt(0) + "").toUpperCase().concat(s1.substring(1).toLowerCase());
        System.out.println(answer);
    }
}
