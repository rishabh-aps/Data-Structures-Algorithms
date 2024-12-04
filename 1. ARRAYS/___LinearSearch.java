public class ___LinearSearch {

  // Function to perform linear search on the given array 'arr' for the element
  // 'x'.
  // Time Complexity: O(n), where n is the length of the array. In the worst case,
  // we might have to check all elements.
  // Space Complexity: O(1), as we do not use any extra space. The search is
  // performed in place.
  static int search(int arr[], int x) {
    // Get the length of the array.
    int n = arr.length;

    // Iterate through the array to find the element 'x'.
    for (int i = 0; i < n; i++) {
      // If the element at index 'i' matches 'x', return the index.
      if (arr[i] == x) {
        return i;
      }
    }

    // If the element 'x' is not found, return -1 to indicate absence.
    return -1;
  }
}
