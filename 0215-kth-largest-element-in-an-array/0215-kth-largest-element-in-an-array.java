class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n= nums.length;

        for(int i =0;i<n;i++){
            q.add(nums[i]);
        }

        k--;

        while(k>0){
            q.remove();
            k--;
        }
        return q.peek();
    }
}











// nums = [9, 5, 2, 7]
// k = 3
// Step 1 — Make max heap:
// Heap looks like (largest first):


// [9, 7, 5, 2]
// Step 2 — First k--:

// k = 3
// k--  // now k = 2 → means "remove 2 numbers"
// Step 3 — While loop:


// while (k > 0) {     // k = 2 → yes
//     q.remove();     // removes 9
//     k--;            // now k = 1
// }

// while (k > 0) {     // k = 1 → yes
//     q.remove();     // removes 7
//     k--;            // now k = 0
// }

// while (k > 0) {     // k = 0 → no, stop
// }