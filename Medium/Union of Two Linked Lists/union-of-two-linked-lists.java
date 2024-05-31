//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	     ArrayList<Integer> sp = new ArrayList<>();
    Node ptr1 = head1;
    Node ptr2 = head2;
    
    while(ptr1 != null ){
        if( !sp.contains(ptr1.data)){
            sp.add(ptr1.data);
        }
        ptr1 = ptr1.next;
        
    }
       
    while(ptr2 != null ){
        if( !sp.contains(ptr2.data)){
            sp.add(ptr2.data);
        }
        
        ptr2 = ptr2.next;
    }
    
    
    Collections.sort(sp);
    
    Node ansH =  new Node(sp.get(0));
    Node curr = ansH;
    int i = 1;
    while( i!= sp.size()){
        curr.next =  new Node(sp.get(i++));
        curr = curr.next;
    }
    
    return ansH;
	}
}