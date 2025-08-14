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