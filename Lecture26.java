public class Lecture26 {
    public static int maxSum(int[] arr, int k) {
        // Initialize the maximum sum and the current window sum
        int maxSum = 0, windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window from start to end of the array
        for (int i = k; i < arr.length; i++) {
            
            windowSum += arr[i] - arr[i - k];
            
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is " + maxSum(arr, k));
    }
}
    

