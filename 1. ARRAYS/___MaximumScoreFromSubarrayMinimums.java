public class ___MaximumScoreFromSubarrayMinimums {
  /**
   * Function to find the pair of adjacent elements with the maximum sum.
   * Time Complexity: O(n) - We iterate through the array once.
   * Space Complexity: O(1) - No additional space is used apart from a few
   * variables.
   *
   * @param array The input array of integers.
   * @return The maximum sum of any pair of adjacent elements.
   */
  public int findMaxSumOfAdjacentPairs(int[] array) {
    // Initialize variables to keep track of the current pair sum and the maximum
    // sum found so far
    int currentPairSum = 0; // Stores the sum of the current pair
    int maxPairSum = Integer.MIN_VALUE; // Stores the maximum pair sum encountered
    int arrayLength = array.length; // Length of the input array

    // Iterate through the array to calculate the sum of each pair of adjacent
    // elements
    for (int i = 0; i < arrayLength - 1; i++) {
      // Calculate the sum of the current pair
      currentPairSum = array[i] + array[i + 1];
      // Update the maximum sum found so far
      maxPairSum = Math.max(maxPairSum, currentPairSum);
    }

    // Return the maximum pair sum
    return maxPairSum;
  }
}
