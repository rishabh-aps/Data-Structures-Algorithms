public class ___LargestElementInArray {

    // Method to find the largest element in the array
    public static int largest(int[] arr) {
        // Initialize the largest element to the first element of the array
        int largestElement = arr[0];

        // Iterate through the array
        for (int num : arr) {
            // Update largestElement if the current element is greater
            if (num > largestElement) {
                largestElement = num;
            }
        }

        // Return the largest element found
        return largestElement;
    }
}

// Time Complexity (TC): O(N)
// - The method iterates through the array once, making the complexity linear
// with respect to the number of elements in the array.

// Space Complexity (SC): O(1)
// - The method uses a constant amount of extra space for the `largestElement`
// variable.
