package InfinityJune21.DivideAndConquer;

public class MedianOfTwoSortedArrays2 {
    static int median(int arr[], int start, int end) {
        int size = end - start + 1;

        if(size % 2 == 0) {
            return (arr[start + (size / 2)] + arr[start + (size / 2 - 1)]) / 2;
        }
        else {
            return arr[start + (size / 2)];
        }
    }

    static int getMedian(int[] a, int[] b,
                         int startA, int startB, int endA, int endB) {
        if(endA - startA == 1) {
            return (Math.max(a[startA], b[startB]) +
                    Math.min(a[endA], b[endB])) / 2;
        }

        //Median of the first array
        int m1 = median(a, startA, endA);

        //Median of the second array
        int m2 = median(b, startB, endB);

        if(m1 == m2) {
            return m1;
        }
        else if(m1 < m2) {
            return getMedian(a, b, (endA + startA + 1) / 2,
                    startB, endA, (endB + startB + 1) / 2);
        }
        else {
            return getMedian(a, b, startA, (endB + startB + 1) / 2,
                    (endA + startA + 1) / 2, endB);
        }
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
            int median = getMedian(arr1, arr2, 0, 0, n1 - 1, n2 - 1);
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
