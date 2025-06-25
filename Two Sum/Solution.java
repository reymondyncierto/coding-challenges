class Solution {
    public int searchVal(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            int search = target - nums[i];
            int result = searchVal(nums, search);
            if ((result != -1) && (result != i)) {
                return new int[]{i, result};
            }
        }
        return new int[]{-1, -1};
    }
}
