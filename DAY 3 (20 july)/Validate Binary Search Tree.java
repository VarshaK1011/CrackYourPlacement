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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        else if(root.right==null && root.left==null)
        {
            return true;
        }
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode root ,long l,long h)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val>l && root.val<h)
        {
            return isValid(root.left,l,root.val) && isValid(root.right,root.val,h);
        }
        return false;
    }
}