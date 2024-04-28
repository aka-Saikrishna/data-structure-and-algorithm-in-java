//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    String solve(int[] arr, int n) {
        // code here
        String a1 = "";
        String a2 = "";
        Arrays.sort(arr);
        int i = 0;
        while(i < n && arr[i] == 0)i++;
        if(i == n)return "0";
        while(i < n){
            a1 += arr[i++];
            if(i < n)a2 += arr[i++];
        }
        int j = a1.length()-1;
        int k = a2.length()-1;
        int carry =0;
        StringBuilder sb = new StringBuilder("");
        while(j >= 0 || k >= 0 || carry != 0){
            int sum = carry;
            if(j >= 0)sum += a1.charAt(j--)-'0';
            if(k >= 0)sum += a2.charAt(k--)-'0';
            sb.append(sum%10);
            carry = sum/10;
        }
        sb.reverse();
        return sb+"";
    }
}
