public class ___485MaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    int arrayLength = nums.length; // Length of the input array
    int currentConsecutiveOnes = 0; // Counter for the current sequence of consecutive ones
    int maxConsecutiveOnes = 0; // Counter for the maximum sequence of consecutive ones found so far

    int index = 0; // Starting index for iteration
    while (index < arrayLength) {
      if (nums[index] == 1) {
        // Increment the current count of consecutive ones if the current element is 1
        currentConsecutiveOnes++;
        // Update the maximum count so far
        maxConsecutiveOnes = Math.max(currentConsecutiveOnes, maxConsecutiveOnes);
      } else {
        // Reset the current count of consecutive ones if the current element is not 1
        currentConsecutiveOnes = 0;
      }
      index++;
    }

    return maxConsecutiveOnes;
  }
}
