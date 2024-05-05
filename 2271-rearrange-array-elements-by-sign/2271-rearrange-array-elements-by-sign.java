class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s=nums.length;
        int [] p=new int[s/2];
        int [] n=new int[s/2];
 
         int pIndex = 0, nIndex = 0;
        for(int i=0;i<s;i++){
            if(nums[i]>=0){
                p[pIndex++]=nums[i];
            }
            else if(nums[i]<0) {
            n[nIndex++]=nums[i];
           }
        }
     
        for(int i=0;i<s;i++){
            if(i%2==0) nums[i]=p[i/2];
            else nums[i]=n[i/2];
        }
        return nums;
    }
}