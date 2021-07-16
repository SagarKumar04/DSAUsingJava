package InfinityJune21.OOPS.Polymorphism.RunTime;

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area of figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        double area = dim1 * dim2;
        System.out.println("Inside area of rectangle");
        return area;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        double area = (dim1 * dim2) / 2;
        System.out.println("Inside area of rectangle");
        return area;
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figRef;

        figRef = r;
        System.out.println("Area of Rectangle: " + figRef.area());

        figRef = t;
        System.out.println("Area of Rectangle: " + figRef.area());

        figRef = f;
        System.out.println("Area of Rectangle: " + figRef.area());
    }
}
