package InfinityJune21.Heap;

import java.util.Scanner;
public class MaxHeap {
    private int heap[];
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
        size = 0;
    }

    public void swap(int position1, int position2) {
        int temp = heap[position1];
        heap[position1] = heap[position2];
        heap[position2] = temp;
    }

    public int parent(int position) {
        return (position - 1) / 2;
    }

    public void insert(int element) {
        heap[size] = element;

        int current = size;
        while(heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }

        size++;
    }

    public void print() {
        System.out.println("Parent - Child:");
        for(int i = 0; i <= (size / 2); i++) {
            System.out.println("Parent: " + heap[i]);
            System.out.println("Left Child: " + heap[2 * i + 1]);
            System.out.println("Right Child: " + heap[2 * i + 2]);
            System.out.println();
        }
    }

    public void printArray() {
        System.out.println("Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MaxHeap maxHeap = new MaxHeap(20);
        System.out.print("Enter size of heap: ");
        int size = scanner.nextInt();

        for(int i = 0; i < size; i++) {
            System.out.print("Enter value of the element to insert: ");
            int element = scanner.nextInt();

            maxHeap.insert(element);
        }

        maxHeap.printArray();
        maxHeap.print();
    }
}
