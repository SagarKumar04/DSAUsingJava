package InfinityJune21.OOPS.Inheritance;

class AnotherBox {
    double width;
    double height;
    double length;

    AnotherBox() {
        width = height = length = -1;
    }

    AnotherBox(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }
}

class AnotherBoxWeight extends AnotherBox {
    double weight;

    AnotherBoxWeight(double w, double h, double l, double m) {
        //super(w, h, l);
        weight = m;
    }
}

public class SuperKeywordWithoutPrivateMember {
    public static void main(String[] args) {
        AnotherBox myAnotherBox = new AnotherBox(10, 20,30);

        AnotherBoxWeight myAnotherBoxWeight = new AnotherBoxWeight(100, 200, 330.2, 120.10);

        System.out.println(myAnotherBox.length);
        System.out.println(myAnotherBox.width);
        System.out.println(myAnotherBox.height);

        System.out.println();

        System.out.println(myAnotherBoxWeight.length);
        System.out.println(myAnotherBoxWeight.width);
        System.out.println(myAnotherBoxWeight.height);
        System.out.println(myAnotherBoxWeight.weight);
    }
}