public class ___2149RearrangeArrayElementsBySign {

  /**
   * Rearranges the elements of the array such that positive and negative numbers
   * alternate, starting with a positive number. It is guaranteed that the number
   * of positive and negative elements is the same.
   *
   * @param nums the input array containing equal numbers of positive and negative
   *             integers.
   * @return the rearranged array.
   *
   *         Time Complexity: O(n)
   *         - The loop runs through the array exactly once, performing
   *         constant-time operations for each element.
   *
   *         Space Complexity: O(n)
   *         - A new array `finalArray` of the same size as the input is created,
   *         leading to linear space usage.
   */
  public int[] rearrangeArray(int[] nums) {
    int arrayLength = nums.length;
    int[] finalArray = new int[arrayLength];
    int positivePointer = 0; // Pointer for placing positive numbers at even indices.
    int negativePointer = 1; // Pointer for placing negative numbers at odd indices.

    for (int i = 0; i < arrayLength; i++) {
      if (nums[i] > 0) {
        finalArray[positivePointer] = nums[i];
        positivePointer += 2; // Move pointer to the next even index.
      } else {
        finalArray[negativePointer] = nums[i];
        negativePointer += 2; // Move pointer to the next odd index.
      }
    }
    return finalArray;
  }
}
