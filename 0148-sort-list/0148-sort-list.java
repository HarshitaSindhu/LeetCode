

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(values);

        temp = head; 
        for (int i = 0; i < values.size(); i++) {
            temp.val = values.get(i);
            temp = temp.next;
        }

        return head;
    }
}
