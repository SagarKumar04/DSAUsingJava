package InfinityJune21.OOPS.Inheritance;

class G {
    int i;
}

class H extends G{
    int i;

    H(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class SecondUseOfSuper {
    public static void main(String[] args) {
        H h = new H(1, 2);
        h.show();
    }
}