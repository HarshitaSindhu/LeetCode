class Solution {
    static ArrayList<Integer> answer;

    static void recur(TreeNode root) {
        if (root == null) {
            return;
        }
        answer.add(root.val);
        recur(root.left);
        recur(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        recur(root);
        return answer;
    }
}
