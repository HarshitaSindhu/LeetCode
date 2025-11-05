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


   public void rightView(TreeNode root , List<Integer> result , int currentDepth){
    if(root== null){
        return;
    }
    if(currentDepth == result.size()){
        result.add(root.val);
    }
    rightView(root.right , result , currentDepth+1);
    rightView(root.left , result , currentDepth+1);
   }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root , result , 0);
        return result;
    }
}