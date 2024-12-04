public class ___53MaximumSubarray {

  public int maxSubArray(int[] nums) {
    // Initialize currentMax and globalMax to the first element
    int currentMax = nums[0];
    int globalMax = nums[0];

    // Start the loop from the second element
    for (int i = 1; i < nums.length; i++) {
      // Update currentMax to be the maximum of the current number or the currentMax
      // including current number
      currentMax = Math.max(nums[i], currentMax + nums[i]);

      // Update globalMax if the currentMax is greater
      globalMax = Math.max(globalMax, currentMax);
    }

    return globalMax;
  }
}
