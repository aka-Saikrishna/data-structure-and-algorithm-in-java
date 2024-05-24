//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static String longestPalin(String s) {

        ArrayList<String> palindrome = new ArrayList<>();
        palindrome.add(s.substring(0, 1));

        for (var i = 0; i < s.length() - 1; i++) {
            calculateLength(s, i, i + 1, palindrome);
            calculateLength(s, i - 1, i + 1, palindrome);
        }

        return palindrome.get(0);
    }

    private static void calculateLength(String s, int low, int high, 
					ArrayList<String> palindrome) {

        int n = s.length();

        while (high < n && low >= 0 &&
                s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }

        low++;
        high--;

        if (high - low + 1 > palindrome.get(0).length()) {
            palindrome.set(0, s.substring(low, high + 1));
        }
    }
}