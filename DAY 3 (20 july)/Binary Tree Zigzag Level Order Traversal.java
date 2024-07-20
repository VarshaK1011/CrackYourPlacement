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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return lot(root);
    }
      public static List<List<Integer>> lot(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root!=null)
        {
            q.offer(root);
        }
        int k=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> subans=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                if(k%2!=0)
                {
                    subans.add(0,node.val);
                }
                else
                subans.add(node.val);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            k++;
            ans.add(subans);
        }
        return ans;
    } 
}