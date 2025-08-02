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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        int index = 0;
        while (index < queue.size()) {
            int levelSize = queue.size() - index;

            List<TreeNode> currentLevelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.get(index);
                currentLevelNodes.add(node);
                index++;

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            TreeNode rightmostNode = currentLevelNodes.get(currentLevelNodes.size() - 1);
            result.add(rightmostNode.val);
        }

        return result;
    }
}
