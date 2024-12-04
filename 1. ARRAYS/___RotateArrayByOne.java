public class ___RotateArrayByOne {
  public void rotate(int[] arr) {
    // Get the length of the array
    int n = arr.length;

    // Store the last element of the array, which will be moved to the front
    int lastElement = arr[n - 1];

    // Shift all elements from the second last to the first position one step to the
    // right
    for (int i = n - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }

    // Set the first element to the stored last element
    arr[0] = lastElement;
  }
}

/*
 * Time Complexity: O(n)
 * - We iterate over the array exactly once, shifting all elements one position
 * to the right.
 * - Hence, the time complexity is O(n), where n is the number of elements in
 * the array.
 * 
 * Space Complexity: O(1)
 * - The space complexity is constant because no extra space proportional to the
 * input size is used.
 * - Only a fixed amount of space (lastElement variable) is used.
 */
