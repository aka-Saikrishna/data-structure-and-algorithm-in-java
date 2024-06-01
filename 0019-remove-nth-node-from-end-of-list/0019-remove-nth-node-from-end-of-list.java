/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
          if(head == null) return head;
        if(head.next == null) return head=head.next;
        int count=0;

        ListNode temp = head;
        ListNode temp2 = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int counter2 = count-n;
        if(counter2 == 0) return head.next; 
            ListNode prev;
        while(temp2!=null && temp2.next!= null ){
            counter2--;

            prev = temp2;
            temp2 = temp2.next;
            if(counter2 ==0){
                prev.next = temp2.next;
                break;

            }
            
            

       


        }
        return head;
    }
}