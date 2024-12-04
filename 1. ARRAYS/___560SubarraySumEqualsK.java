import java.util.HashMap;

public class ___560SubarraySumEqualsK {

  public int subarraySum(int[] nums, int targetSum) {
    // Stores the cumulative sum at each point while iterating through the array.
    int cumulativeSum = 0;
    // Keeps count of subarrays whose sum equals targetSum.
    int subarrayCount = 0;
    // HashMap to store the frequency of cumulative sums encountered.
    HashMap<Integer, Integer> cumulativeSumFrequency = new HashMap<>();
    // Iterate over the array to calculate subarray sums.
    for (int index = 0; index < nums.length; index++) {
      // Add the current element to the cumulative sum.
      cumulativeSum += nums[index];
      // Check if the cumulative sum itself is equal to the targetSum.
      if (cumulativeSum == targetSum) {
        subarrayCount++;
      }
      // Check if there exists a cumulative sum such that the difference
      // between the current cumulative sum and it equals the targetSum.
      if (cumulativeSumFrequency.containsKey(cumulativeSum - targetSum)) {
        // If found, add the frequency of that cumulative sum to subarrayCount.
        subarrayCount += cumulativeSumFrequency.get(cumulativeSum - targetSum);
      }
      // Update the frequency of the current cumulative sum in the HashMap.
      cumulativeSumFrequency.put(cumulativeSum, cumulativeSumFrequency.getOrDefault(cumulativeSum, 0) + 1);
    }
    return subarrayCount;
  }

  /**
   * Time Complexity: O(n)
   * - We iterate through the array once, performing O(1) operations for each
   * element.
   *
   * Space Complexity: O(n)
   * - The HashMap can store up to n different cumulative sums in the worst case.
   */
}
