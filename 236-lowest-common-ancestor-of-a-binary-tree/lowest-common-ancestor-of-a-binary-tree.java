/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // code here
        if(root==null) return null;
        if(root==p || root==q) return root;
        boolean pInleft=Exist(root.left, p);
        boolean qInleft=Exist(root.left, q);
        if(pInleft && qInleft) return lowestCommonAncestor(root.left,p,q);
        else if(!pInleft && !qInleft) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
    public boolean Exist(TreeNode root, TreeNode val){
        if(root==null) return false;
        if(root==val) return true;
        return Exist(root.left, val) || Exist(root.right,val);
    }
}