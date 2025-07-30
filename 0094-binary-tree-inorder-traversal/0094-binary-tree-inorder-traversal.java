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
   static ArrayList<Integer> answer;
   public static void recursion(TreeNode root){
    if(root == null){
        return ; 
    }
    recursion(root.left);
    answer.add(root.val);
    recursion(root.right);

   }

    public List<Integer> inorderTraversal(TreeNode root) {
     answer = new ArrayList<>();
     recursion(root);
     return answer;   
    }
}