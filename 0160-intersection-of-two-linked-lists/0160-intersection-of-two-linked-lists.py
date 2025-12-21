# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        lenA = self.getListLength(headA)
        lenB = self.getListLength(headB)

        while lenA > lenB:
            headA = headA.next
            lenA -= 1

        while lenB > lenA:
            headB = headB.next
            lenB -= 1

        while headA != headB:
            headA = headA.next
            headB = headB.next

        return headA

    def getListLength(self, head: ListNode) -> int:
        length = 0
        while head:
            length += 1
            head = head.next
        return length
