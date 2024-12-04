import java.util.ArrayList;

public class ___IntersectionOfTwoSortedArrays {
    // Function to return a list containing the intersection of two sorted arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // Initialize an ArrayList to store the intersection elements.
        ArrayList<Integer> result = new ArrayList<>();

        // Two pointers to traverse both arrays.
        int i = 0, j = 0;

        // Traverse both arrays until one of them is completely processed.
        while (i < arr1.length && j < arr2.length) {
            // If elements at both pointers are equal, it's part of the intersection.
            if (arr1[i] == arr2[j]) {
                // To avoid duplicates, check if the result list is empty
                // or if the current element is not the same as the last added element.
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++; // Move both pointers forward.
                j++;
            } else if (arr1[i] < arr2[j]) {
                // If the current element of arr1 is smaller, move the pointer of arr1.
                i++;
            } else {
                // If the current element of arr2 is smaller, move the pointer of arr2.
                j++;
            }
        }

        // Return the result list containing the intersection elements.
        return result;
    }
}

/*
 * Explanation:
 * 1. The function uses the two-pointer technique to efficiently find the
 * intersection of two sorted arrays.
 * 2. Since the arrays are sorted, the pointers can move in a linear fashion,
 * comparing elements to find matches.
 * 3. Duplicates are avoided by checking if the last added element in the result
 * list is the same as the current element.
 * 
 * Time Complexity:
 * 1. Traversing both arrays takes O(N + M), where N is the length of arr1, and
 * M is the length of arr2.
 * 2. Comparisons at each step are constant-time operations.
 * 
 * Overall Time Complexity: O(N + M).
 * 
 * Space Complexity:
 * 1. The result ArrayList takes O(K) space, where K is the number of unique
 * intersection elements.
 * 2. No additional space is used apart from the result list.
 * 
 * Overall Space Complexity: O(K).
 */
