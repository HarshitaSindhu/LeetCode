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
    public ListNode sortList(ListNode head) {
     if(head == null || head.next == null){
        return head;
     }   

    List<Integer> data = new ArrayList<>();
    ListNode temp = head;

    while(temp!= null){
        data.add(temp.val);
        temp = temp.next;
    }

    Collections.sort(data);
       temp = head;
    for (int i = 0; i < data.size(); i++) {
            temp.val = data.get(i);
            temp = temp.next;
        }

        return head;

    }
}