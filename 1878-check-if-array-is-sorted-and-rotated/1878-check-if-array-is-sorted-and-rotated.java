class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 1; j < n; j++) {
                if (nums[j] < nums[j - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
            int temp = nums[0];
            for (int j = 1; j < n; j++) {
                nums[j - 1] = nums[j];
            }
            nums[n - 1] = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Example 1: " + solution.check(nums1)); // Output: true
        
        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Example 2: " + solution.check(nums2)); // Output: false
        
        int[] nums3 = {1, 2, 3};
        System.out.println("Example 3: " + solution.check(nums3)); // Output: true
    }
}
