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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int currentSize = q.size();
            ArrayList<Integer> currentRow = new ArrayList<>();
            while(currentSize>0){
                TreeNode TopMost = q.remove();
                currentRow.add(TopMost.val);
                if(TopMost.left!= null){
                    q.add(TopMost.left);
                }
                if(TopMost.right!= null){
                    q.add(TopMost.right);
                }
                currentSize--;

            }
            answer.add(currentRow);
        }
        return answer;
    }
}