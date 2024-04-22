//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.getTable(N);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int ans;
        for(int i=1;i<=10;i++)
        {
            ans=N*i;
            list.add(ans);
        }
        return list;
    }
}