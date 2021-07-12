package InfinityJune21.OOPS.Contructors;

public class ParameterizedConstructorsExample {
    //initializing the variables
    int a, b;

    ParameterizedConstructorsExample(int v1, int v2) {
        a = v2;
        b = v1;
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
        ParameterizedConstructorsExample n1 = new ParameterizedConstructorsExample(150, 250);
        n1.display();

        //initialization with the help of a user-defined function
        n1.initializeVariables();
        n1.display();

        //initialization with the help of a dot operator (by accessing the variables)
        n1.a = 100;
        n1.b = 200;
        n1.display();

        ParameterizedConstructorsExample n2 = new ParameterizedConstructorsExample(1500, 2500);
        n2.display();
    }
}
