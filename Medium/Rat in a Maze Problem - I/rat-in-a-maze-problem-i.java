//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void findThePath(int i,int j,int [][]grid,ArrayList<String>ans,
    String s,int n,int m,boolean[][]vis){
        if(i<0 || i==n || j<0 || j==m || grid[i][j]==0 || vis[i][j]==true){
            return;
        }
        if(i==n-1 && j==m-1 && grid[i][j]==1 && vis[i][j]==false){
            ans.add(s);
            return;
        }
        
        if(vis[i][j]==false){
            vis[i][j]=true;
        findThePath(i+1,j,grid,ans,s+'D',n,m,vis);
         findThePath(i,j-1,grid,ans,s+'L',n,m,vis);
          findThePath(i,j+1,grid,ans,s+'R',n,m,vis);
           findThePath(i-1,j,grid,ans,s+'U',n,m,vis);
           vis[i][j]=false;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        if(m[0][0]==0)return new ArrayList<>();
        boolean vis[][]=new boolean[n][n];
        ArrayList<String>ans = new ArrayList<>();
        findThePath(0,0,m,ans,"",n,n,vis);
        
        return ans;
    }
}