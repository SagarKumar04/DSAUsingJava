package InfinityJune21.OOPS.Contructors;

public class NonParameterizedConstructorsExample {
    //initializing the variables
    int a = 1000, b = 2000;

    NonParameterizedConstructorsExample() {
        a = 1;
        b = 2;
    }

    void display() {
        System.out.println("a: " + a + "\n" + "b: " + b);
        System.out.println("-----");
    }

    void initializeVariables() {
        a = 10;
        b = 20;
    }

    public static void main(String[] args) {
        //initialization with the help of a default constructor
        NonParameterizedConstructorsExample n1 = new NonParameterizedConstructorsExample();
        n1.display();

        //initialization with the help of a user-defined function
        n1.initializeVariables();
        n1.display();

        //initialization with the help of a dot operator (by accessing the variables)
        n1.a = 100;
        n1.b = 200;
        n1.display();

        NonParameterizedConstructorsExample n2 = new NonParameterizedConstructorsExample();
        n2.display();
        n2.initializeVariables();
        n2.display();
        n1.a = 100;
        n1.b = 200;
        n1.display();
    }
}
