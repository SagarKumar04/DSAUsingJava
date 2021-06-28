package InfinityJune21;

public class ConversionsExample {
    public static void main(String[] args) {
        int i = 1257;
        float f = i;
        System.out.println(f);

        float f1 = 1257.1f;
        int i1 = (int)f1;
        System.out.println(i1);

        String s = "8";
        //int i2 = (int)s;
        int i2 = Integer.parseInt(s);
        System.out.println("i2: " + i2);

        char c = '0';
        int i3 = c;
        System.out.println("i3: " + i3);

        int i4 = 99;
        char c1 = (char) i4;
        System.out.println("c1: " + c1);
    }
}
