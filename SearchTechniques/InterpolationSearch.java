package InfinityJune21.SearchTechniques;

public class InterpolationSearch {
    static int interpolationSearch(int arr[], int lo, int hi, int element) {
        int pos;

        if(lo <= hi && element >= arr[lo] && element <= arr[hi]) {
            pos = lo + ((hi - lo) / (arr[hi] - arr[lo])) * (element - arr[lo]);

            if(arr[pos] == element) {
                return pos;
            }

            if(arr[pos] < element) {
                return interpolationSearch(arr, pos + 1, hi, element);
            }

            if(arr[pos] > element) {
                return interpolationSearch(arr, lo, pos - 1, element);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 20, 24, 25, 35, 42, 50, 61, 73};
        int length = arr.length;
        int element = 61;
        int index = interpolationSearch(arr, 0, length - 1, element);

        System.out.println("Index: " + index);
    }
}
