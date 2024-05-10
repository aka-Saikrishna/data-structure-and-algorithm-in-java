//{ Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int startrow=0;
        int endrow=r-1;
        int startcol=0;
        int endcol=c-1;
        
        ArrayList<Integer> al=new ArrayList<>();
        
        while(startrow<=endrow && startcol<=endcol){
            
            for(int j=startcol;j<=endcol;j++){
                al.add(matrix[startrow][j]);
            }
             startrow++;
            
            for(int i=startrow;i<=endrow;i++){
                al.add(matrix[i][endcol]);
            }

            endcol--;
          if(startrow<=endrow)  {
            for(int k=endcol;k>=startcol;k--){

                al.add(matrix[endrow][k]);
            }
            endrow--;
        }
            
            if(startcol<=endcol){
            
            for(int l=endrow;l>=startrow;l--){
  
                al.add(matrix[l][startcol]);
                
            }
            startcol++;
   
        }
            
        }
        return al;
        
    }
}