public class ___136SingleNumber {
  // This method finds the single element that appears only once in the array
  public int findUniqueNumber(int[] numbers) {
    int arrayLength = numbers.length;

    // Initialize the variable that will hold the unique number
    int uniqueNumber = 0;

    // Iterate over the array and perform XOR operation
    // Time Complexity: O(n) - Traverse the array once
    for (int i = 0; i < arrayLength; i++) {
      uniqueNumber ^= numbers[i]; // XOR operation to find the unique number
    }

    // Return the unique number
    return uniqueNumber;
  }
}

/*
 * Time Complexity:
 * - O(n): The method iterates over the array only once, which means it runs in
 * linear time in relation to the number of elements in the array.
 * 
 * Space Complexity:
 * - O(1): The algorithm uses a constant amount of extra space (the variable
 * 'uniqueNumber') regardless of the size of the input array.
 * 
 * The XOR operation works because it has the property where:
 * 1. a ^ a = 0 (any number XOR with itself results in 0)
 * 2. a ^ 0 = a (any number XOR with 0 remains unchanged)
 * Using this property, all the numbers that appear twice cancel each other out,
 * leaving only the number that appears once.
 */
