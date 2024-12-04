public class ___LongestSubArrayWithSumK {
    public int lenOfLongestSubarr(int[] arr, int k) {
        int n = arr.length;
        int start = 0; // Start pointer
        int currentSum = 0; // Running sum
        int maxLength = 0; // Max length of subarray with sum k

        for (int current = 0; current < n; current++) {
            // Add the current element to the running sum
            currentSum += arr[current];

            // Shrink the window if the sum exceeds k
            while (currentSum > k && start <= current) {
                currentSum -= arr[start];
                start++;
            }

            // Check if the current sum equals k
            if (currentSum == k) {
                maxLength = Math.max(maxLength, current - start + 1);
            }
        }

        return maxLength;
    }
}
