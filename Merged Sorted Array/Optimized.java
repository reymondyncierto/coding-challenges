import java.util.Arrays;

public class Optimized {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;      // nums1's last element
    int j = n - 1;      // nums2's last element
    int k = m + n - 1;  // placement in nums1

    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }

    // if nums2 has still element, copy
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
    
    System.out.println(Arrays.toString(nums1));
  }

  public static void main(String[] args) {
    Optimized sol = new Optimized();

    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int m = 3;
    int n = 3;

    sol.merge(nums1, m, nums2, n);
  }
}
