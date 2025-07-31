
class Solution {
  public boolean recur(TreeNode root , long start , long end ){
    if(root ==null){
      return true;
    }
    if(root.val<start|| root.val>end ){
      return false;
    }
    boolean isLeftValid = recur(root.left , start , (long)root.val-1);
    boolean isRightValid = recur(root.right , (long)root.val+1  , end );
    return (isRightValid && isLeftValid);
    
  }
  public boolean isValidBST(TreeNode root){
    return  recur(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
  }
}