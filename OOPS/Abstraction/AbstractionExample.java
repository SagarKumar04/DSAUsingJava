package InfinityJune21.OOPS.Abstraction;

abstract class Figure {
    double dim1;
    double dim2;

    //concrete method is also allowed
    void display() {
        System.out.println("In display() of Figure class");
    }

    abstract double area(); //abstract method
    //since method is abstract, the class should be abstract as well
}

/*
a class which inherits abstract class has to either implement the abstract
method of the superclass or be declared abstract themselves
 */
class Rectangle extends Figure {
    double area() {
        dim1 = 10;
        dim2 = 20;
        System.out.println("In area() of Rectangle class");
        return dim1 * dim2;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        /*
        Figure f = new Figure();

        Since Figure is an abstract class, it cannot be instantiated
         */
        Rectangle rectangle = new Rectangle();
        double area = rectangle.area();
        System.out.println("Area of Rectangle is: " + area);

        rectangle.display();
    }
}
