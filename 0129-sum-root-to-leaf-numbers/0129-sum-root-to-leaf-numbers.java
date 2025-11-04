class Solution {
    int num = 0;
    int sum = 0;

    public void recur(TreeNode root) {
        if (root == null) {
            return;
        }
        num = num * 10 + root.val;

        if (root.left == null && root.right == null) {
            sum += num;
        }

        recur(root.left);
        recur(root.right);

        num = num / 10;
    }

    public int sumNumbers(TreeNode root) {
        sum = 0;
        num = 0;
        recur(root);
        return sum;
    }
}
