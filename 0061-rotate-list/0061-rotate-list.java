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
    public static int reduce(ListNode head, int k){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return k < size
        ? k
        : k % size;
    }

    public static ListNode wishfulThinking(ListNode head, int k){
        if(k == 0 || head == null || head.next == null){return head;}
        ListNode wish = wishfulThinking(head, k - 1);
        ListNode temp = wish;
        while(wish.next.next != null){
            wish = wish.next;
        }
        wish.next.next = temp;
        temp = wish.next;
        wish.next = null;
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){return head;}
        int steps = reduce(head, k);
        return wishfulThinking(head, steps);
    }
}