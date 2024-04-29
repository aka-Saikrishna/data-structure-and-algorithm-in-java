//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[]=new int[2];
        
        int repeating=-1,missing=-1;
        
        for(int i=0;i<n;i++)
        {
            int index = Math.abs(arr[i])-1;
            if(arr[index]<0)
            repeating = index+1;
            else
            arr[index] = -arr[index];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            missing=i+1;
        }
        ans[0]=repeating;
        ans[1]=missing==-1?n+1:missing;
        return ans;
    }
}