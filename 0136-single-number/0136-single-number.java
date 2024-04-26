class Solution {
    public int singleNumber(int[] nums) {

        int temp=nums[0];

        for(int i=1;i<nums.length;i++){
                temp^=nums[i];
        }

        return temp;
    }
}