public class ___73SetMatrixZeroes {

  /**
   * Sets rows and columns to zero in a matrix based on the positions of zero
   * elements.
   * 
   * Time Complexity: O(m * n), where m is the number of rows and n is the number
   * of columns.
   * - The first pass iterates through all elements to mark rows and columns → O(m
   * * n).
   * - The second pass iterates through all elements again to set zeroes → O(m *
   * n).
   * 
   * Space Complexity: O(1), as no additional space is used apart from the
   * variable firstColFlag.
   * - The matrix itself is used for marking rows and columns.
   * 
   * @param matrix The input matrix to modify.
   */
  public void setZeroes(int[][] matrix) {
    int numRows = matrix.length;
    int numCols = matrix[0].length;
    int firstColFlag = 1;

    // First pass: Mark rows and columns that need to be zeroed
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0; // Mark the row
          if (j == 0) {
            firstColFlag = 0; // Mark the first column
          } else {
            matrix[0][j] = 0; // Mark the column
          }
        }
      }
    }

    // Second pass: Set elements to zero based on markers
    for (int i = numRows - 1; i >= 0; i--) {
      for (int j = numCols - 1; j >= 0; j--) {
        if (j == 0) {
          // Handle the first column separately
          if (firstColFlag == 0) {
            matrix[i][j] = 0;
          }
        } else if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          // Set to zero if the row or column is marked
          matrix[i][j] = 0;
        }
      }
    }
  }
}
