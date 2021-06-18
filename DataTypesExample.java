import java.util.Scanner; //1

public class DataTypesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //2

        //Integer
        //byte, short, int, long
        byte b = scanner.nextByte();
        short s = scanner.nextShort();
        int i = scanner.nextInt();
        long l = scanner.nextLong();
        System.out.println("b: " + b + " s: " + s + " i: " + i + " l: " + l);
        //"Java" + "Program" -> "JavaProgram"

        //Decimal Value
        //float, double
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();
        System.out.println("f: " + f + " d: " + d);

        //Characters
        //char
        char c = scanner.next().charAt(0);
        //Charcter: 'c', '3', '$'
        //String: "Java", "Computer"
        System.out.println("c: " + c);

        //String
        String s1 = scanner.next();
        String s2 = scanner.nextLine();
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        //"Java" + 8 -> "Java8"

        //Boolean
        boolean b1 = scanner.nextBoolean();
        System.out.println("b1: " + b1);
    }
}
