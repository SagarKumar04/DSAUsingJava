package InfinityJune21.OOPS.Encapsulation.Test;

import InfinityJune21.OOPS.Encapsulation.PrivateAccessExample;

public class AccessFromDifferentPackage {
    public static void main(String[] args) {
        PrivateAccessExample p = new PrivateAccessExample();
        p.d = 100;
        float d = p.d;
        System.out.println("d: " + d);
    }
}
