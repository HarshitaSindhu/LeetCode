# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:

    def reverse(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev  = None
        curr = head
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        return prev    

    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if not head or not head.next:
            return True
        
        slow = head 
        fast = head
        while fast and fast.next:
            slow = slow.next 
            fast = fast.next.next
            
        j =self.reverse(slow)
        i = head
        
        while j:
           if i.val != j.val:
             return False  
           i = i.next
           j = j.next  
        return True 