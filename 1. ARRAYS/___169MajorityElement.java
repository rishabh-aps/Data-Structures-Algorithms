public class ___169MajorityElement {

  /**
   * Finds the majority element in the input array.
   * The majority element is defined as the element that appears more than n / 2
   * times.
   * This solution uses the Boyer-Moore Voting Algorithm to find the majority
   * element.
   * 
   * @param numbers the input array of integers
   * @return the majority element
   *
   *         Time Complexity: O(n) - The algorithm iterates over the array only
   *         once.
   *         Space Complexity: O(1) - The solution uses constant space.
   */
  public int majorityElement(int[] numbers) {
    // Initialize the candidate for majority element and its count
    int majorityElement = 0; // Variable to store the majority candidate
    int count = 0; // Count of the majority candidate

    // Iterate over the input array to determine the majority element
    for (int index = 0; index < numbers.length; index++) {
      if (count == 0) {
        // When count is 0, update majority candidate to the current element
        majorityElement = numbers[index];
        count = 1;
      } else if (numbers[index] == majorityElement) {
        // If the current element matches the majority candidate, increment the count
        count++;
      } else {
        // If the current element does not match, decrement the count
        count--;
      }
    }

    // Return the majority element (guaranteed to exist)
    return majorityElement;
  }
}
