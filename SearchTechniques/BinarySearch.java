package InfinityJune21.SearchTechniques;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {18, 19, 21, 25, 40, 88, 115};
        int length = arr.length;
        int key = 125;
        int left = 0;
        int right = length - 1;
        int mid = -1;
        while(left <= right) {
            mid = (left + right) / 2;

            if(arr[mid] > key) {
                right = mid - 1;
            }
            else if(arr[mid] < key) {
                left = mid + 1;
            }
            else {
                break;
            }
        }

        if(left > right) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + mid);
        }
    }
}
