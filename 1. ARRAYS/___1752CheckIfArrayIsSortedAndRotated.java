public class ___1752CheckIfArrayIsSortedAndRotated {

    // Method to check if the array is sorted and rotated
    public boolean check(int[] nums) {
        int count = 0; // Counter to track the number of 'unsorted' pairs
        int n = nums.length; // Length of the array

        // Traverse the array to count the number of "violations" in sorting
        for (int i = 0; i < n; i++) {
            // Compare the current element with the next element (with wrap-around)
            if (nums[i] > nums[(i + 1) % n]) {
                count++; // Increment the count if the order is violated
            }
        }

        // If there is at most one violation, the array is sorted and rotated
        if (count <= 1) {
            return true;
        }

        // Return false if there are more than one violations
        return false;
    }
}

/*
 * Time Complexity:
 * - The loop runs through the array once, performing constant-time operations
 * for each element.
 * - The complexity is O(N), where N is the length of the array.
 * 
 * Space Complexity:
 * - The algorithm uses a constant amount of extra space for the variable
 * `count` and does not use any additional data structures.
 * - The space complexity is O(1).
 * 
 * Explanation:
 * 1. The method iterates over the array elements exactly once, checking each
 * pair of elements `(nums[i], nums[i+1])`.
 * 2. To handle the "rotation boundary," the code uses `(i + 1) % n` to compare
 * the last element (`nums[n-1]`) with the first element (`nums[0]`).
 * 3. The `count` variable tracks how many times the array violates the sorted
 * order. For a valid sorted and rotated array, there can be at most one such
 * violation.
 * 4. If `count` exceeds 1, it means the array is neither sorted nor properly
 * rotated, so the method returns `false`.
 * 5. If `count` is 0 or 1, the array satisfies the sorted and rotated
 * condition, so the method returns `true`.
 * 
 * Example 1:
 * Input: [3, 4, 5, 1, 2]
 * - Comparisons: 3 < 4, 4 < 5, 5 > 1 (violation), 1 < 2
 * - Count = 1
 * - Output: true
 * 
 * Example 2:
 * Input: [2, 1, 3, 4]
 * - Comparisons: 2 > 1 (violation), 1 < 3, 3 < 4, 4 < 2 (violation)
 * - Count = 2
 * - Output: false
 * 
 */