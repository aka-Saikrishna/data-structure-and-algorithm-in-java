class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse( nums,0, nums.length-1) ;
        reverse( nums,0, k-1);
        reverse( nums,k, nums.length-1); 
    }
    public void reverse(int[]nums,int startposition,int endposition){
        while(startposition<endposition){
            int temp=nums[startposition];
            nums[startposition]=nums[endposition];
            nums[endposition]=temp;
            startposition++;
            endposition--;
        }
    }
}