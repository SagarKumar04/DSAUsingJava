package InfinityJune21.MergeSort;

public class MergeSortExample {
    static void printArray(int arr[]) {
        int size = arr.length; //finding size of the array

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[], int low, int high) {
        if(low < high) {
            int middle = (low + high) / 2;
            sort(arr, low, middle);
            sort(arr, middle + 1, high);

            merge(arr, low, middle, high);
        }
    }

    static void merge(int[] arr, int low, int middle, int high) {
        //size of the left and right arrays
        int size1 = middle - low + 1;
        int size2 = high - middle;

        //declaring the two arrays
        int left[] = new int[size1];
        int right[] = new int[size2];

        //initializing the two arrays
        for(int i = 0; i < size1; i++) {
            left[i] = arr[low + i];
        }
        for(int i = 0; i < size2; i++) {
            right[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while(i < size1 && j < size2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < size1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < size2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {23, 18, 29, 30, 10, 49, 99, 45};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Original Array: ");
        printArray(arr); //printing the array

        sort(arr, low, high);

        System.out.println();

        System.out.println("Sorted Array: ");
        printArray(arr); //printing the array
    }
}
