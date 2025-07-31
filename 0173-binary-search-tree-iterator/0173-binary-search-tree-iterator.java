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
class BSTIterator {
   Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        insert(root);
    }
    public void insert(TreeNode root){
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }
    public int next() {
        TreeNode topNode = st.peek();
        st.pop();
        int answer = topNode.val;
        if(topNode.right != null){
            insert(topNode.right);
        }
        return answer;
    }
    
    public boolean hasNext() {
        return (st.size() == 0? false:true);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */