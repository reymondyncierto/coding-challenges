import java.util.HashMap;
import java.util.Map;

public class Optimized {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>(); // key, index

    for (int i=0; i<nums.length; i++) {
      int complement = target - nums[i];

      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return new int[]{-1, -1}; // no solution
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 22;

    Optimized sol = new Optimized();
    int[] result = sol.twoSum(nums, target);

    if(result[0] != -1) {
      System.out.println("Indices found: " + result[0] + ", " + result[1]);
    } else {
      System.out.println("No two sum solution found");
    }
  }
}
