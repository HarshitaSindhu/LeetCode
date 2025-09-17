
public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> indexList = new ArrayList<>();

        queue.offer(root);
        indexList.add(0); // Start with root at index 0

        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = indexList.get(0); // Index of first node at this level
            int end = indexList.get(size - 1); // Index of last node at this level
            maxWidth = Math.max(maxWidth, end - start + 1);

            ArrayList<Integer> newIndexList = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = indexList.remove(0) - start; // Normalize index

                if (node.left != null) {
                    queue.offer(node.left);
                    newIndexList.add(2 * index + 1);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    newIndexList.add(2 * index + 2);
                }
            }

            indexList = newIndexList; // Move to next level
        }

        return maxWidth;
    }

}




