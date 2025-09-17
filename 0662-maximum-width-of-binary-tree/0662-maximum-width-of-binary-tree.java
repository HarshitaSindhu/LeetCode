
public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;

        // Queue stores nodes at current level
        Queue<TreeNode> queue = new LinkedList<>();
        // ArrayList stores indices corresponding to nodes in the queue
        ArrayList<Integer> indexList = new ArrayList<>();

        queue.offer(root);
        indexList.add(0); // root index is 0

        while (!queue.isEmpty()) {
            int size = queue.size();
            int firstIndex = indexList.get(0);
            int lastIndex = indexList.get(size - 1);
            maxWidth = Math.max(maxWidth, lastIndex - firstIndex + 1);

            // Prepare for next level
            ArrayList<Integer> newIndexList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = indexList.remove(0);

                // Assign indices for children and add them to queue and index list
                if (node.left != null) {
                    queue.offer(node.left);
                    newIndexList.add(2 * index + 1);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    newIndexList.add(2 * index + 2);
                }
            }
            indexList = newIndexList;
        }

        return maxWidth;
    }

}