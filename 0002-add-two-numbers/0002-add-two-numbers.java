
class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode i = l1;
        ListNode j = l2;
        ListNode aH = null;
        ListNode aT = null;
        int carry = 0;

        while (i != null && j != null) {
            int sum = i.val + j.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (aH == null && aT == null) {
                aH = newNode;
                aT = newNode;
            } else {
                aT.next = newNode;
                aT = newNode;
            }
            i = i.next;
            j = j.next;
        }

        while (i != null) {
            int sum = i.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (aH == null && aT == null) {
                aH = newNode;
                aT = newNode;
            } else {
                aT.next = newNode;
                aT = newNode;
            }
            i = i.next;
        }

        while (j != null) {
            int sum = j.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (aH == null && aT == null) {
                aH = newNode;
                aT = newNode;
            } else {
                aT.next = newNode;
                aT = newNode;
            }
            j = j.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            if (aT == null) {
                aH = newNode;
                aT = newNode;
            } else {
                aT.next = newNode;
                aT = newNode;
            }
        }

        aH = reverseList(aH);
        return aH;
    }
}

