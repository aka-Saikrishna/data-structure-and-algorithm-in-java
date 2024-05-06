//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int target) {
       int start = 0;
       int sum = 0;
       for (int x = 0; x < n; x++) {
            sum += arr[x];
            while (sum > target) {
                if (start == x) {
                    sum = arr[x];
                    break;
                }
                if ((sum -= arr[start++]) == 0) break;
            }
            if (sum == target) return new ArrayList(List.of(start + 1, x + 1));
       }
       return new ArrayList(List.of(-1));
    }
}