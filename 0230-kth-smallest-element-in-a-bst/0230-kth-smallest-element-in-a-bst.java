/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0 ;
    int answer = -1;
   
    public void recur(TreeNode node , int k ){
        if(node== null ){
            return;
        }
        recur(node.left, k);
        count ++;
        if(count == k){
            answer = node.val;
            return ;
        }
        recur(node.right, k );
    }
     public int kthSmallest(TreeNode root, int k) {
     recur(root , k);
     return answer;   
    }
}