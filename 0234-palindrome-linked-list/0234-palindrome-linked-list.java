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
        ListNode prev =null;
        ListNode temp =head;
        while(temp!=null){
            ListNode nxt = temp .next ;
            temp.next=prev;
            prev = temp;
            temp =nxt;

        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) {
      
        ListNode slow  = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next
            ;


        }
        ListNode currentNode =reverse(slow);
        ListNode i = head;
        ListNode j=currentNode;
        while(j!=null){
            if(i.val!=j.val){
                return false ;
            }
            i=i.next;
            j=j.next;
        }
        return true ;
    }
}