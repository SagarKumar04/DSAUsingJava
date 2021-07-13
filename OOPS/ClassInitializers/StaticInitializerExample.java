package InfinityJune21.OOPS.ClassInitializers;

public class StaticInitializerExample {
    static int numArray[] = new int[10];

    //static initializer
    static {
        System.out.println("Static Initializer Array: ");

        for(int i = 0; i < numArray.length; i++) {
            double randomNumber = Math.random();
            System.out.print(randomNumber + " ");
            numArray[i] = (int)(randomNumber * 100);
            System.out.print(numArray[i]);
            System.out.println();
        }
    }

    void printArray() {
        System.out.println("Array: ");
        for(int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("In main()");
        StaticInitializerExample s = new StaticInitializerExample();
        s.printArray();
    }
}
