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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        if(root==null)
        {
            return ans;
        }
        right(root,ans);
        return ans;
    }
    public static void right(TreeNode root,List<Integer> ans)
    {
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        if(root!=null)
        {
            q.offer(root);
        }
        int x=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                hm.put(x,node.val);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            x++;
        }
        for(int k=0;k<hm.size();k++)
        {
            ans.add(hm.get(k));
        }
    }
}