public class ___SecondLargest {

    // Method to find the second largest element in the array
    public int getSecondLargest(int[] arr) {
        // Initialize largest and second largest elements
        int largestElement = arr[0];
        int secondLargestElement = -1;
        int n = arr.length;

        // Traverse the array from the second element
        for (int i = 1; i < n; i++) {
            // If the current element is greater than the largest element
            if (arr[i] > largestElement) {
                // Update the second largest to the current largest
                secondLargestElement = largestElement;
                // Update the largest element to the current element
                largestElement = arr[i];
            }
            // If the current element is greater than the second largest and not equal to
            // the largest
            else if (arr[i] > secondLargestElement && arr[i] != largestElement) {
                // Update the second largest element
                secondLargestElement = arr[i];
            }
        }

        // Return the second largest element
        return secondLargestElement;
    }
}

// Time Complexity (TC): O(N)
// - The method iterates through the array once, resulting in linear time
// complexity.

// Space Complexity (SC): O(1)
// - The method uses a constant amount of additional space for the variables
// largestElement and secondLargestElement.
