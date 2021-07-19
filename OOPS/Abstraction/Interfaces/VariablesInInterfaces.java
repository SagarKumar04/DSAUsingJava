package InfinityJune21.OOPS.Abstraction.Interfaces;

interface Constants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
}

public class VariablesInInterfaces implements Constants {
    public static void main(String[] args) {
        System.out.println(NO);
        System.out.println(YES);
        System.out.println(MAYBE);
    }
}
