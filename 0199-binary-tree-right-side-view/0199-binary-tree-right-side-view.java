import java.util.ArrayList;
import java.util.List;

class Solution {
    public void rightView(TreeNode root, List<Integer> result, int currentDepth) {
        if (root == null) {
            return;
        }
        
        if (currentDepth == result.size()) {
            result.add(root.val);
        }
        
        rightView(root.right, result, currentDepth + 1);
        rightView(root.left, result, currentDepth + 1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, result, 0);
        return result;
    }
}
