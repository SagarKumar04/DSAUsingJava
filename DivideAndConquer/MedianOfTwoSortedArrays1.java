package InfinityJune21.DivideAndConquer;

public class MedianOfTwoSortedArrays1 {
    static int getMedian(int arr1[], int arr2[], int n) {
        int i = 0, j = 0, count, m1 = -1, m2 = -1;

        for(count = 0; count <= n; count++) {
            if(i == n) {
                m1 = m2;
                m2 = arr2[0];
                break;
            }
            if(j == n) {
                m1 = m2;
                m2 = arr1[0];
                break;
            }
            if(arr1[i] <= arr2[j]) {
                m1 = m2;
                m2 = arr1[i];
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }

        int median = (m1 + m2) / 2;

        return median;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 13, 25, 40, 50};
        int arr2[] = {60, 70, 80, 90, 100};
        /*
        Merged array: 1, 2, 13, 17, 25, 30, 40, 45, 50, 70
        (25 + 30) / 2 = 27
         */

        int n1 = arr1.length;
        int n2 = arr2.length;

        long startTime = System.nanoTime();
        if(n1 == n2) {
            int median = getMedian(arr1, arr2, n1);
            System.out.println(median);
        }
        else {
            System.out.println("Size of arrays are not equal");
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
