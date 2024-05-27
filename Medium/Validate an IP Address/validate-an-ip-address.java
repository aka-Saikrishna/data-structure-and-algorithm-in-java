//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        int count=0;
        for(char c : s.toCharArray()){
            if(c=='.') count++;
        }
        String[] parts=s.split("\\.");
        if(count!=3 ||parts.length!=4) return false;
       
        for(String part:parts){
            try{
                int value=Integer.parseInt(part);
                if(value<0 ||value>255) return false;
                if(part.length()>1&&part.charAt(0)=='0') return false;
            }catch(NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}