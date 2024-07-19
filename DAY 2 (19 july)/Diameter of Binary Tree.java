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
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        max=Integer.MIN_VALUE;
        dia(root);
        return max;
    }
    public  int dia(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=dia(root.left);
        int right=dia(root.right);
        max=Math.max((left+right),max);
        return 1+Math.max(left,right);
    }
}