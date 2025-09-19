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
    int answer =(int)(-1e9);
    public int recur(TreeNode root){
        if(root==null){
            return 0;
        }
        int option1 = root.val;
        int left = (root.left ==null ?(int) (-1e9):recur(root.left));
                int right = (root.right==null ?(int) (-1e9):recur(root.right));

        int option2=Math.max(option1,Math.max((option1 + left) ,(option1 +right)));
        int option3 =  option1+right +left;
        int option4 = Math.max(left,right);
        answer =Math.max(answer,Math.max(option1,Math.max(option2,Math.max(option3,option4))));
        return option2;

    }
    public int maxPathSum(TreeNode root) {
        recur(root);
        return answer;
    }
}