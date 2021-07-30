package InfinityJune21.SearchTechniques;

public class JumpSearch {
    public static int jumpSearch(int arr[], int key) {
        int length = arr.length;
        int step = (int)Math.sqrt(length);

        int prev = 0;

        while(arr[Math.min(step, length) - 1] < key) {
            prev = step;
            step = step + (int)Math.sqrt(length);

            if(prev >= length) {
                return -1;
            }
        }

        while(arr[prev] < key) {
            prev++;

            if(prev == (Math.min(step, length)) - 1) {
                return -1;
            }
        }

        if(arr[prev] == key) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
        144, 233, 377, 610};

        int key = 1;
        int index = jumpSearch(arr, key);

        if(index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
