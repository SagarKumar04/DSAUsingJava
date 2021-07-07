package InfinityJune21.StringBuffer;

public class DeleteExample {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("This is an example");
        string.delete(5, 7);
        System.out.println(string);

        string.deleteCharAt(4);
        System.out.println(string);
    }
}
