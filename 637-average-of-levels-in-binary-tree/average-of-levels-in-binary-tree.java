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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            double add=0;
            int count=0;
            for(int i=0; i<size; i++){
               TreeNode node=q.remove();
               add += node.val;
               count++;
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }
            double result=add/count;
            ans.add(result);
        }
        return ans;
    }
}