package InfinityJune21.Heap;

public class HeapSort {
    private void printArray(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Max Heapify
    public void heapify(int arr[], int size, int root) {
        int largest = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        //If left child is larger than root
        if(leftChild < size && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        //If right child is larger than root
        if(rightChild < size && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if(largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            //Recursively call heapify on the affected subtree
            heapify(arr, size, largest);
        }
    }

    public void sort(int arr[], int size) {
        //Build a heap
        for(int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }

        //Delete the heap
        for(int i = (size - 1); i > 0; i--) {
            int rootElement = arr[0];
            arr[0] = arr[i];
            arr[i] = rootElement;

            //Call heapify() on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 11, 1, 10, 14, 18, 26};
        int size = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr, size);

        System.out.println("Sorted Array: ");
        heapSort.printArray(arr, size);
    }
}
