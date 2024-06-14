//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
     int j = n-2;
        Stack<Long> stack = new Stack<Long>();
        stack.push(arr[n-1]);
        arr[n-1] = -1;
        for(;j >= 0;){
            if(!stack.isEmpty()){
                long val = stack.peek();
                if(arr[j] >= val){
                    stack.pop();
                    continue;
                }
                else{
                    stack.push(arr[j]);
                    arr[j] = val;
                }
            }
            else{
                stack.push(arr[j]);
                arr[j] = -1;
            }
            j--;
        }
        return arr; 
}
}