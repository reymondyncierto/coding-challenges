class Solution {
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        char[] nums = numStr.toCharArray();

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != nums[nums.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
