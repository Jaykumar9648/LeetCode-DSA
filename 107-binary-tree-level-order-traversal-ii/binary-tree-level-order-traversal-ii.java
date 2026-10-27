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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        //create queue for level order traversing
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            //individual arraylist for ever level
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0; i<size; i++){
              TreeNode node = q.remove();
               level.add(node.val);
              // collections.reverse(level);
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }
            ans.add(level);
        }
        Collections.reverse(ans);
        return ans;
    }
}