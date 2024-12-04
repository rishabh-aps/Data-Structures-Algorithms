public class ___75SortColors {

  private void swap(int[] nums, int firstIndex, int secondIndex) {
    int temp = nums[firstIndex];
    nums[firstIndex] = nums[secondIndex];
    nums[secondIndex] = temp;
  }

  /**
   * Sorts an array of integers where:
   * - 0 represents red
   * - 1 represents white
   * - 2 represents blue
   * 
   * This method uses the Dutch National Flag Algorithm to sort the array in-place
   * with linear time complexity.
   *
   * @param nums An array of integers with values 0, 1, or 2.
   */
  public void sortColors(int[] nums) {
    int arrayLength = nums.length; // Length of the input array
    int start = 0; // Pointer to place the next 0
    int end = arrayLength - 1; // Pointer to place the next 2
    int current = 0; // Pointer to traverse the array

    // Process elements until the current pointer crosses the end pointer
    while (current <= end) {
      if (nums[current] == 0) { // Case when the current element is 0
        swap(nums, current, start); // Swap current element with the start pointer
        start++; // Move the start pointer forward
        current++; // Move the current pointer forward
      } else if (nums[current] == 1) { // Case when the current element is 1
        current++; // Simply move the current pointer forward
      } else { // Case when the current element is 2
        swap(nums, current, end); // Swap current element with the end pointer
        end--; // Move the end pointer backward
        // Do not increment current; the swapped element at current must be reprocessed
      }
    }
  }

  /**
   * Time Complexity:
   * - Each element is processed exactly once, resulting in O(n) time complexity,
   * where n is the length of the array.
   *
   * Space Complexity:
   * - The algorithm uses in-place swaps, requiring no additional space.
   * - Space complexity is O(1).
   */
}
