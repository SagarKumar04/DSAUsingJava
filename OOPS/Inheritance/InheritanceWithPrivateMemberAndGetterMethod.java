package InfinityJune21.OOPS.Inheritance;

class C {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    int getJ() {
        return j;
    }
}

class D extends C {
    int total;

    void sum() {
        //total = i + j; //j is inaccesible in D as it is private
        total = i + getJ();
    }
}

public class InheritanceWithPrivateMemberAndGetterMethod {
    public static void main(String[] args) {
        D subOb = new D();
        subOb.setij(10, 20);
        subOb.sum();
        System.out.println("Sum is: " + subOb.total);
    }
}
