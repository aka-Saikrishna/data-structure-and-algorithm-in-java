//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
        // Your code here
        ArrayList<Integer> l = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();

        int left = 0, right = 0;
        while(right < n){
            while(q.size() > 0 && q.peekLast() < arr[right]){
                q.removeLast();
            }
            q.add(arr[right]);

            
            if((right - left + 1) < k)
                right++;
                
            else if((right - left + 1) == k){
                l.add(q.peek());
                
                right++;
                if(q.peek() == arr[left]){
                    q.removeFirst();
                }
                left++;
            }
        }
        return l;
    } 
    
}