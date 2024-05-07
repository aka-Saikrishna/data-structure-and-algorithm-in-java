//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int majorityElement(int a[], int size) {
        int res = 0;
        int count = 1;

        // Find the potential majority element
        for (int i = 1; i < size; i++) {
            if (a[res] == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count = 1;
                res = i;
            }
        }

        // Count the occurrences of the potential majority element
        count = 0;
        for (int i = 0; i < size; i++) {
            if (a[res] == a[i]) {
                count++;
            }
        }

        // Check if the potential majority element is the actual majority element
        if (count > size / 2) {
            return a[res];
        } else {
            return -1;
        }
    }
}