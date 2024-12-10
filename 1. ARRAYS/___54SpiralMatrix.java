import java.util.ArrayList;
import java.util.List;

public class ___54SpiralMatrix {

    /**
     * Returns the elements of the matrix in spiral order.
     *
     * @param matrix The input 2D matrix.
     * @return A list of integers in spiral order.
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize boundaries.
        int left = 0;
        int right = cols - 1;
        int top = 0;
        int bottom = rows - 1;

        List<Integer> result = new ArrayList<>();

        // Traverse the matrix in spiral order.
        while (left <= right && top <= bottom) {

            // Traverse from left to right across the top boundary.
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++; // Move the top boundary downward.

            // Traverse from top to bottom along the right boundary.
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--; // Move the right boundary leftward.

            // Check if there are still rows and columns to process.
            if (top <= bottom) {
                // Traverse from right to left across the bottom boundary.
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--; // Move the bottom boundary upward.
            }

            if (left <= right) {
                // Traverse from bottom to top along the left boundary.
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++; // Move the left boundary rightward.
            }
        }

        return result;
    }

    /**
     * Time Complexity: O(m * n)
     * - Each element is visited exactly once.
     *
     * Space Complexity: O(1) (excluding the output list)
     * - No additional data structures are used besides the output list.
     */
}
