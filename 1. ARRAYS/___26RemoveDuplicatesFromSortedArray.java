public class ___26RemoveDuplicatesFromSortedArray {

    // Method to remove duplicates from a sorted array and return the new length
    public int removeDuplicates(int[] nums) {
        int n = nums.length; // Get the length of the array

        // Pointer to keep track of the last unique element's position
        int uniqueElementIndex = 0;

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If the current element is different from the last unique element
            if (nums[uniqueElementIndex] != nums[i]) {
                uniqueElementIndex++; // Move the pointer to the next position
                nums[uniqueElementIndex] = nums[i]; // Update the unique element in-place
            }
        }

        // Return the count of unique elements (index + 1, as the array is 0-indexed)
        return uniqueElementIndex + 1;
    }
}

/*
 * ### Time Complexity:
 * 1. The method iterates through the array once using a single loop.
 * 2. Each comparison and assignment operation is performed in constant time.
 * 3. **Overall Time Complexity**: O(N), where N is the number of elements in
 * the array.
 * 
 * ### Space Complexity:
 * 1. The method modifies the input array in-place and does not use any
 * additional data structures.
 * 2. **Overall Space Complexity**: O(1) (constant extra space).
 * 
 * ### Explanation:
 * 1. The array is assumed to be sorted, so duplicates will always appear
 * consecutively.
 * 2. The `uniqueElementIndex` pointer keeps track of the position to place the
 * next unique element.
 * 3. Whenever a new unique element is found, it is placed in the array at the
 * position tracked by `uniqueElementIndex`.
 * 4. The method returns the count of unique elements, which is the length of
 * the modified array.
 * 
 * ### Example:
 * Input: nums = [1, 1, 2, 3, 3]
 * - Step 1: Start with `uniqueElementIndex = 0`
 * - Step 2: Compare and update:
 * - nums[1] == nums[0] -> skip
 * - nums[2] != nums[0] -> update nums[1] = nums[2], uniqueElementIndex = 1
 * - nums[3] != nums[1] -> update nums[2] = nums[3], uniqueElementIndex = 2
 * - nums[4] == nums[2] -> skip
 * - Final array: nums = [1, 2, 3, _, _]
 * - Output: 3 (new length)
 * 
 * ### Edge Cases:
 * 1. Empty array: `nums = []` -> Output: 0
 * 2. Single element array: `nums = [1]` -> Output: 1
 * 3. Array with no duplicates: `nums = [1, 2, 3]` -> Output: 3
 * 4. Array with all duplicates: `nums = [1, 1, 1]` -> Output: 1
 */