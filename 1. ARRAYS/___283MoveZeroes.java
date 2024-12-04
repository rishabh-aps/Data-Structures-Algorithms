import java.util.ArrayList;

public class ___283MoveZeroes {

  // Function to move all zeroes in the array to the end, while maintaining the
  // order of non-zero elements.
  // Time Complexity: O(n), where n is the length of the array. We iterate through
  // the array twice.
  // Space Complexity: O(n), since we use an ArrayList to store all the non-zero
  // elements.
  public void moveZeroes(int[] nums) {
    int n = nums.length;

    // Step 1: Create a list to store all non-zero elements.
    ArrayList<Integer> nonZeroElementList = new ArrayList<>();

    // Iterate through the array and add all non-zero elements to the list.
    // Time Complexity: O(n) for this loop.
    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        nonZeroElementList.add(nums[i]);
      }
    }

    // Step 2: Reconstruct the array with non-zero elements followed by zeroes.
    // First, place the non-zero elements in their original order.
    // Then, fill the remaining positions with zeroes.
    // Time Complexity: O(n) for this loop.
    for (int i = 0; i < n; i++) {
      if (i < nonZeroElementList.size()) {
        nums[i] = nonZeroElementList.get(i); // Fill in non-zero elements.
      } else {
        nums[i] = 0; // Fill remaining slots with zeroes.
      }
    }
  }
}
