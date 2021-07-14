package InfinityJune21.OOPS.Inheritance;

class Box {
    private double width;
    private double height;
    private double length;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        length = ob.length;
    }

    Box(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }

    Box() {
        width = height = length = -1;
    }

    Box(double len) {
        width = height = length = len;
    }

    double volume() {
        double volume = length * width * height;

        return volume;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double l, double m) {
        super(w, h, l);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len) {
        super(len);
        weight = len;
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        double volume, weight;

        BoxWeight myBox = new BoxWeight(10, 20, 33.2, 12.10);
        BoxWeight myBox1 = new BoxWeight(myBox);
        volume = myBox1.volume();
        weight = myBox1.weight;
        System.out.println("myBox1: volume: " + volume + " weight: " + weight);

        BoxWeight myBox2 = new BoxWeight();
        volume = myBox2.volume();
        weight = myBox2.weight;
        System.out.println("myBox2: volume: " + volume + " weight: " + weight);
    }
}
