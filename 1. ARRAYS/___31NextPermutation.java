public class ___31NextPermutation {
    /**
     * Reverses the subarray within the given range [start, end].
     *
     * @param arr   The array to be modified.
     * @param start The starting index of the subarray.
     * @param end   The ending index of the subarray.
     */
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Modifies the given array to the next lexicographical permutation.
     * If no such permutation exists (the array is sorted in descending order),
     * it rearranges the array into the smallest lexicographical order.
     *
     * Algorithm:
     * 1. Find the first decreasing element from the end of the array (inflection
     * point).
     * 2. If no such element exists, reverse the entire array (sorted in descending
     * order).
     * 3. Otherwise:
     * a. Find the smallest element larger than the inflection point to the right.
     * b. Swap this element with the inflection point.
     * c. Reverse the subarray to the right of the inflection point.
     *
     * Time Complexity: O(n)
     * - Finding the inflection point: O(n)
     * - Finding the smallest element larger than the inflection point: O(n)
     * - Reversing the subarray: O(n)
     * Overall: O(3n) ≈ O(n)
     *
     * Space Complexity: O(1)
     * - Modifies the input array in-place with no additional space.
     *
     * @param nums The input array to be modified.
     */
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int inflectionPoint = -1;

        // Step 1: Find the first decreasing element from the end.
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                inflectionPoint = i;
                break;
            }
        }

        // Step 2: If no inflection point exists, reverse the entire array.
        if (inflectionPoint == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest element larger than nums[inflectionPoint] to the
        // right.
        for (int i = n - 1; i > inflectionPoint; i--) {
            if (nums[i] > nums[inflectionPoint]) {
                // Swap nums[i] and nums[inflectionPoint].
                int temp = nums[i];
                nums[i] = nums[inflectionPoint];
                nums[inflectionPoint] = temp;
                break;
            }
        }

        // Step 4: Reverse the subarray to the right of the inflection point.
        reverse(nums, inflectionPoint + 1, n - 1);
    }

}
