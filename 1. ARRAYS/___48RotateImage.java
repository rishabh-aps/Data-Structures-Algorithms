public class ___48RotateImage {

    /**
     * Rotates the given n x n 2D matrix 90 degrees clockwise.
     *
     * @param matrix The input 2D matrix to rotate.
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length; // The matrix is n x n.

        // Step 1: Transpose the matrix.
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) { // Ensure col > row to avoid swapping back.
                // Swap elements across the diagonal.
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Step 2: Reverse each row to achieve the 90-degree clockwise rotation.
        for (int row = 0; row < n; row++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                // Swap elements in the row.
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }

    /**
     * Time Complexity: O(n^2)
     * - Transposing the matrix takes O(n^2) as we iterate over half the elements.
     * - Reversing each row also takes O(n^2) as we iterate over all rows and swap
     * elements within them.
     *
     * Space Complexity: O(1)
     * - The rotation is done in place with no additional data structures.
     */
}
