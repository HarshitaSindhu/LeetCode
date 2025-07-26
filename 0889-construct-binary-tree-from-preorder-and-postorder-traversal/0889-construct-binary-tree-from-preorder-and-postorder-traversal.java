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
    
        return helper(preorder, postorder, 0, 0, preorder.length);
    }

    private TreeNode helper(int[] preorder, int[] postorder, int preStart, int postStart, int n) {
        if (n == 0) return null;
        
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        if (n == 1) return root;
        
        int leftRootVal = preorder[preStart + 1];
        
        int leftSubtreeSize = 0;
        for (int i = postStart; i < postStart + n; i++) {
            if (postorder[i] == leftRootVal) {
                leftSubtreeSize = i - postStart + 1;
                break;
            }
        }

        root.left = helper(preorder, postorder, preStart + 1, postStart, leftSubtreeSize);
        root.right = helper(preorder, postorder, preStart + leftSubtreeSize + 1, postStart + leftSubtreeSize, n - leftSubtreeSize - 1);

        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] preorder = {1, 2, 4, 5, 3};
        int[] postorder = {4, 5, 2, 3, 1};
        
        TreeNode root = solution.constructFromPrePost(preorder, postorder);
        
        System.out.println("Root of the tree: " + root.val);
    }
}