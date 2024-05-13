class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // int mid  = (start + end) / 2; // may exceed the int range

          int mid = start + (end - start) / 2; // better way to find mid 

            if(target > nums[mid] ) {
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else{
                return mid;
            }

        }

        return start;
        
    }
}