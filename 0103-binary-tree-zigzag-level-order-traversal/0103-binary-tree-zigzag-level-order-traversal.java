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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            List<Integer> currentRow = new ArrayList<>();
            while (currentSize > 0) {
                TreeNode topMost = queue.poll();
                if (leftToRight) {
                    currentRow.add(topMost.val);
                } else { 
                    currentRow.add(0, topMost.val);
                }
                if (topMost.left != null) {
                    queue.add(topMost.left);
                }
                if (topMost.right != null) {
                    queue.add(topMost.right);
                }
                currentSize--;
            }
            result.add(currentRow);
            leftToRight = !leftToRight;
        }
        return result;
    }
}
