class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {

        int maxCount=0;
        int curCount=0;


        for(int element: nums){
            if(element==0){

                if(maxCount<curCount){
                    maxCount=curCount;
                }
                curCount=0;                
            }
            else{
                curCount++;
            }
        }

        return maxCount>curCount? maxCount:curCount;
        
    }
}