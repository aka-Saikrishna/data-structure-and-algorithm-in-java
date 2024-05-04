class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] temp = new int[2];
            if(ans.get(ans.size()-1)[1] >= intervals[i][0]){
                temp[0] = Math.min(ans.get(ans.size()-1)[0],intervals[i][0]);
                temp[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
                ans.set(ans.size()-1,temp);
            }else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}