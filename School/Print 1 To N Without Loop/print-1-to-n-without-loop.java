//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    //creating an object of class Print
		    Solution obj=new Solution();
		    int N;
		    
		    //input N
		    N=sc.nextInt();
		    
		    //calling printNos() methdo
		    //of class Print
		    obj.printNos(N);
		    System.out.println();
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java



class Solution {
    
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Solution solution = new Solution();
        int N = scn.nextInt();
        solution.printNos(N);
    }
    public void printNos(int N) {
        printNnumbers(1, N); // Start printing numbers from 1 to N
    }
    
    public int printNnumbers(int current, int N) {
        if (current <= N) {
            System.out.print(current + " "); // Print the current number
            return 1 + printNnumbers(current + 1, N); // Recursively print the next number and return the count
        }
        return 0; // Base case: reached N, so return 0
    }
    

}