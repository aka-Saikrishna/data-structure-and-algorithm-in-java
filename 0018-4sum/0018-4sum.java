class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n= nums.length;
        if(nums==null || n==0) return ans;
        Arrays.sort(nums);
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                long find = (long)target - (long)(nums[i]+nums[j]);
                int left = j+1;
                int right = n-1;
                while(left<right){
                    long sum = (long)nums[left]+(long)nums[right];
                    if(find>sum) left++;
                    else if(find<sum) right--;
                    else{
                        List<Integer> tem = new ArrayList<>();
                        tem.add(nums[i]); tem.add(nums[j]);
                        tem.add(nums[left]); tem.add(nums[right]);
                        ans.add(tem);
                        
                        while(left<right && nums[left]==tem.get(2)) ++left;
                        while(left<right && nums[right]==tem.get(3)) --right;
                    }
                }
                while(j+1<n && nums[j]==nums[j+1]) ++j;
            }
            while(i+1<n && nums[i]==nums[i+1]) ++i;
        }
        return ans;
    }
}