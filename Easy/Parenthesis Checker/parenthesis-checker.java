//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
         Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(st.size()==0){
                st.push(x.charAt(i));
            }
            else{
                int a=st.peek();
                int b=x.charAt(i);
                if((a==40 && b==41) || (a==123 && b==125) || (a==91 && b==93)){
                    st.pop();
                }
                else{
                    st.push(x.charAt(i));
                }
                
            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
