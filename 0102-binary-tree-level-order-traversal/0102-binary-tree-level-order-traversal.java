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
        if(root== null){
            return answer;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int currentsize = q.size();
            List<Integer> currentRow = new ArrayList<>();
            while(currentsize>0){
                TreeNode topNode = q.remove();
                currentRow.add(topNode.val);
                if(topNode.left!= null){
                    q.add(topNode.left);
                }
                if(topNode.right!= null){
                    q.add(topNode.right);

                }
                currentsize--;
            }
            answer.add(currentRow);
        }
            return answer;


            }
}