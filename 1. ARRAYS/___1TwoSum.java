import java.util.HashMap;

public class ___1TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int arrayLength = nums.length;
    for (int index = 0; index < arrayLength; index++) {
      int currentElement = nums[index];
      int nextElement = target - currentElement;
      if (map.containsKey(nextElement)) {
        int firstIndex = map.get(nextElement);
        int secondIndex = index;
        return new int[] { firstIndex, secondIndex };
      }
      map.put(currentElement, index);
    }
    return new int[] { -1, -1 };
  }
}
