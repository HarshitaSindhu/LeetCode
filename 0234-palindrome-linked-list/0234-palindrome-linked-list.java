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

   public ListNode reverse(ListNode head){
    ListNode tempp = head;
    ListNode prev = null;

    while(tempp!= null){
        ListNode nxt = tempp.next;
        tempp.next= prev;
        prev=tempp;
        tempp= nxt;
    }
    return prev;
   }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead= reverse(slow);

        ListNode i = head;
        ListNode j = newHead;
        

        while(j!=null){
        if(i.val!= j.val){
            return false;
        }
        i= i.next;
        j= j.next;
    }
       return true;
    }
}