import java.util.ArrayList;

public class ___UnionOfTwoSortedArraysWithDuplicateElements {

    // Method to find the union of two sorted arrays
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n1 = a.length; // Length of the first array
        int n2 = b.length; // Length of the second array
        int i = 0; // Pointer for the first array
        int j = 0; // Pointer for the second array
        ArrayList<Integer> union = new ArrayList<>(); // Resultant union ArrayList

        // Traverse both arrays simultaneously
        while (i < n1 && j < n2) {
            // If the current element of the first array is smaller
            if (a[i] < b[j]) {
                // Add the element only if it is not already present in the union list
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++; // Move the pointer in the first array
            } else {
                // Add the element from the second array if it is unique in the union list
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++; // Move the pointer in the second array
            }
        }

        // Add remaining elements from the first array (if any)
        while (i < n1) {
            if (union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        // Add remaining elements from the second array (if any)
        while (j < n2) {
            if (union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union; // Return the final union ArrayList
    }
}

/**
 * Method to find the union of two sorted arrays with duplicate elements.
 * 
 * Time Complexity: O(n1 + n2)
 * - We traverse both arrays fully (n1 and n2 are the sizes of arrays a and b).
 * 
 * Space Complexity: O(n1 + n2)
 * - The union list stores at most all elements from both arrays (in case of no
 * overlap).
 */