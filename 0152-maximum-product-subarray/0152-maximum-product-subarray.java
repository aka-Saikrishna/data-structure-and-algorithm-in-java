class Solution {
    public int maxProduct(int[] nums) {
        return dfs(0, nums);
    }
    public int dfs(int i, int[] nums) {
        if (i >= nums.length - 1) return nums[nums.length - 1];
        
        int res = dfs(i + 1, nums);
        int max = Integer.MIN_VALUE;
        int product = 1;
        
        for (int j = i; j < nums.length; j++) {
            product *= nums[j];
            max = Math.max(product, max);
        }
        return Math.max(res, max);
    }
}