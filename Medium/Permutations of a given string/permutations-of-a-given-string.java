//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
             Set<String> temp=new HashSet<>();
        ArrayList<String> ans=new ArrayList<>();
        permutation("",S,temp);
        ans.addAll(temp);
        Collections.sort(ans);
        return ans;
    }
    public static void permutation(String p,String up,Set<String> temp)
    {
        if(up.isEmpty())
        {
            temp.add(p);
            return;
        }
        char c=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+c+s,up.substring(1),temp);
        }
    }
}