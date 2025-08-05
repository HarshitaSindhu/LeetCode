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
    public static ListNode reverse(ListNode head){

        ListNode temp = head;
        ListNode prev = null;

        while(temp!= null){
            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp ;
            temp = nxt;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
           if (head == null || head.next == null) return true;


        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode mid = slow;
        
       

        ListNode secondHalfHead = reverse(mid);
        ListNode i = head;
        ListNode j = secondHalfHead;
        while(j != null ){
            if(i.val != j.val){
                return false; 
            }
            i = i.next;
            j= j.next;
        }
        return true;
    }
}