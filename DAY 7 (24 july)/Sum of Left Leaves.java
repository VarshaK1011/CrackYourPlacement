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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=getSum(root,false);
        return sum;
        
    }
    public static int getSum(TreeNode root,boolean isLeft)
    {
        int sum=0;
        if(root.left==null && root.right==null)
        {
            return (isLeft)?root.val:0;
        }
        if(root.left!=null)
        {
            sum+=getSum(root.left,true);
        }
        if(root.right!=null)
        {
            sum+=getSum(root.right,false);
        }
        return sum;
    }
}