class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        // Start recursion to build the tree
        return helper(preorder, postorder, 0, 0, preorder.length);
    }

    private TreeNode helper(int[] preorder, int[] postorder, int preStart, int postStart, int n) {
        if (n == 0) return null;
        
        // The root is always the first element in preorder
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        // If there is only one element, we have reached a leaf node
        if (n == 1) return root;
        
        // The next element in preorder is the root of the left subtree
        int leftRootVal = preorder[preStart + 1];
        
        // Find the index of the left root in postorder
        int leftSubtreeSize = 0;
        for (int i = postStart; i < postStart + n; i++) {
            if (postorder[i] == leftRootVal) {
                leftSubtreeSize = i - postStart + 1;
                break;
            }
        }

        // Recursively construct the left and right subtrees
        root.left = helper(preorder, postorder, preStart + 1, postStart, leftSubtreeSize);
        root.right = helper(preorder, postorder, preStart + leftSubtreeSize + 1, postStart + leftSubtreeSize, n - leftSubtreeSize - 1);

        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] preorder = {1, 2, 4, 5, 3};
        int[] postorder = {4, 5, 2, 3, 1};
        
        TreeNode root = solution.constructFromPrePost(preorder, postorder);
        
        // Output the root to verify (for testing purposes)
        System.out.println("Root of the tree: " + root.val);
    }
}
