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
         List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        //create queue for level order traversing
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        while(q.size()>0){
            int size=q.size();
            //individual arraylist for ever level
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0; i<size; i++){
              TreeNode node = q.remove();
               level.add(node.val);
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }
          if (reverse) { 
            Collections.reverse(level);
             }
           ans.add(level); 
           //this is using for toggle(for alternat zigzag)
           reverse = !reverse;
        }
        return ans;
    }
}