public class ___189RotateArray {
    private void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            // Swap elements at 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move pointers towards each other
            start++;
            end--;
        }
    }

    // Main function to rotate the array 'nums' to the right by 'k' steps.
    // Time Complexity: O(n), where n is the length of the array. We perform three
    // full array reversals, each taking O(n).
    // Space Complexity: O(1), as the rotation and reversals are performed in place
    // with no additional data structures.
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Reduce k to within bounds of array length
        k = k % n;

        // Step 1: Reverse the first part of the array (from index 0 to n-k-1).
        reverse(nums, 0, n - k - 1);

        // Step 2: Reverse the second part of the array (from index n-k to n-1).
        reverse(nums, n - k, n - 1);

        // Step 3: Reverse the entire array to achieve the rotated result.
        reverse(nums, 0, n - 1);
    }
}
