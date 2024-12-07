import java.util.ArrayList;
import java.util.Collections;

public class ___ArrayLeaders {

    // Method to find the leaders in an array
    static ArrayList<Integer> leaders(int arr[]) {
        // Initialize an ArrayList to store leaders
        ArrayList<Integer> leaderList = new ArrayList<>();
        int arrayLength = arr.length;

        // Variable to track the maximum element to the right
        int maxToRight = -1;

        // Traverse the array from right to left
        for (int i = arrayLength - 1; i >= 0; i--) {
            // If the current element is greater than or equal to the maximum to its right,
            // it is a leader
            if (arr[i] >= maxToRight) {
                leaderList.add(arr[i]);
                maxToRight = arr[i]; // Update the max to the current element
            }
        }

        // Reverse the list as leaders are collected in reverse order
        Collections.reverse(leaderList);

        return leaderList;
    }
}

/*
 * Time Complexity:
 * - The algorithm traverses the array once (O(n)) to find leaders.
 * - Collections.reverse() also takes O(n) time.
 * - Overall time complexity: O(n).
 * 
 * Space Complexity:
 * - The space used by the leaderList ArrayList is proportional to the number of
 * leaders, which in the worst case is O(n).
 * - No additional space is used beyond leaderList and a few variables.
 * - Overall space complexity: O(n).
 * 
 * 
 */
