//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            String ans = ob.rremove(S).trim();
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String rremove(String s) {
        // code here
         if(s.isEmpty()) return s;
        StringBuilder ans = new StringBuilder();
        helper(ans, s);
        return ans.toString();
    }
    
      void helper(StringBuilder sb, String s){
        boolean [] adjacentFlag = new boolean[s.length()];
        //tag adjacent as true;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i -1) == s.charAt(i)){
                adjacentFlag[i] = adjacentFlag[i - 1] =true;
            }
        }
      
        StringBuilder rem = new StringBuilder();
        //find remaing elements not tagged as true
        for(int i =0 ;i< adjacentFlag.length; i++){
            if(!adjacentFlag[i]) rem.append(s.charAt(i));
        }
      
        //0 Adjacent element(s) exist, return!
        if(rem.length() == s.length()){
            sb.append(s);
            return;
        }
        helper(sb, rem.toString());
    }
}