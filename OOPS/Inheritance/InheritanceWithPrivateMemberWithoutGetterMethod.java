package InfinityJune21.OOPS.Inheritance;

class E {
    int i, s;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
        s = j;
    }

    int getJ() {
        return j;
    }
}

class F extends E {
    int total;

    void sum() {
        //total = i + j; //j is inaccessible in D as it is private
        total = i + s;
    }
}

public class InheritanceWithPrivateMemberWithoutGetterMethod {
    public static void main(String[] args) {
        F subOb = new F();
        subOb.setij(10, 20);
        subOb.sum();
        System.out.println("Sum is: " + subOb.total);
    }
}
