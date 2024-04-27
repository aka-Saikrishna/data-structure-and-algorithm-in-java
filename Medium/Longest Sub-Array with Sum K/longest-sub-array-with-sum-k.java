//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        HashMap<Integer, Integer> sumIndex = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum += A[i];

            if (currentSum == K) {
                maxLength = i + 1;
            }

            if (!sumIndex.containsKey(currentSum)) {
                sumIndex.put(currentSum, i);
            }

            if (sumIndex.containsKey(currentSum - K)) {
                maxLength = Math.max(maxLength, i - sumIndex.get(currentSum - K));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int N = arr.length;
        System.out.println("Length of longest sub-array with sum " + k + " is: " + lenOfLongSubarr(arr, N, k));
    }
}