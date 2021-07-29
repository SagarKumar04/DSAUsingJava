package InfinityJune21.SearchTechniques;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {18, 9, 1, 25, -10, 88, 15};
        int length = arr.length;

        int key = 18;
        int i;
        for(i = 0; i < length; i++) {
            if(arr[i] == key) {
                break;
            }
        }

        if(i != length) {
            System.out.println("Element found at index " + i);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
