public class ___268MissingNumber {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int ans = 0;

    // XOR all the numbers from 0 to n
    for (int i = 0; i <= n; i++) {
      ans ^= i;
    }

    // XOR all the elements in the nums array
    for (int i = 0; i < n; i++) {
      ans ^= nums[i];
    }

    // The result will be the missing number
    return ans;
  }
}

/*
 * Time Complexity Analysis:
 * - XOR-ing all the numbers from 0 to n takes O(n) time.
 * - XOR-ing all the elements of the array nums takes O(n) time.
 * - Therefore, the overall time complexity is O(n).
 * 
 * Space Complexity Analysis:
 * - The space complexity is O(1) because the algorithm uses only a constant
 * amount of extra space (variable `ans`).
 * - No additional data structures are used.
 * 
 * Summary:
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */
