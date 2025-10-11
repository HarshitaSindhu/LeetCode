/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // STEP 1: Insert copy nodes in between original nodes
        Node temp = head;
        while (temp != null) {
            Node nextElement = temp.next;
            Node copy = new Node(temp.val);

            temp.next = copy;
            copy.next = nextElement;

            temp = nextElement;
        }

        // STEP 2: Connect random pointers of copied nodes
        temp = head;
        while (temp != null) {
            Node copyNode = temp.next;
            if (temp.random != null) {
                copyNode.random = temp.random.next;
            } else {
                copyNode.random = null;
            }
            temp = temp.next.next; // move to next original
        }

        // STEP 3: Separate the two lists (original + copy)
        temp = head;
        Node dummy = new Node(-1);
        Node copyHead = dummy;
        while (temp != null) {
            copyHead.next = temp.next;
            copyHead = copyHead.next;

            temp.next = temp.next.next; // restore original
            temp = temp.next;
        }

        return dummy.next; // head of cloned list
    }
}
