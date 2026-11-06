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
    public int sumNumbers(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
       int  result=0;
        sum(root,"",ans);
        for(int i=0; i<ans.size(); i++){
           result+=Integer.parseInt(ans.get(i));
        }
        return result;
    }
    public void sum(TreeNode root,String path, ArrayList<String> ans){
        if(root==null) return;
         path += root.val;

        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        sum(root.left,path, ans);
        sum(root.right, path,ans);

    }
}