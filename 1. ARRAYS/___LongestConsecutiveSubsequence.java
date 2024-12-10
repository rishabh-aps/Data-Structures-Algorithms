import java.util.HashSet;

public class ___LongestConsecutiveSubsequence {
  // Function to return the length of the longest subsequence of consecutive
  // integers.
  public int findLongestConseqSubseq(int[] nums) {
    // HashSet to store the unique elements for quick lookup
    HashSet<Integer> numSet = new HashSet<>();
    int maxLength = 0;

    // Add all elements from the array into the HashSet
    // Time: O(n), where n is the length of the array
    // Space: O(n), for storing elements in the HashSet
    for (int num : nums) {
      numSet.add(num);
    }

    // Iterate through the array to find the longest consecutive subsequence
    // Time: O(n), since each number is processed only once
    for (int num : nums) {
      // Check if the current number is the start of a sequence
      // Time: O(1) for HashSet lookup
      if (!numSet.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;

        // Count the length of the sequence starting from the current number
        // Time: O(1) per lookup, each number is visited only once
        while (numSet.contains(currentNum + 1)) {
          currentNum++;
          currentStreak++;
        }

        // Update the maximum length found so far
        maxLength = Math.max(maxLength, currentStreak);
      }
    }

    // Return the maximum length of consecutive subsequence
    return maxLength;
  }
}

