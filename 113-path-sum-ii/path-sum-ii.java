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
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root, arr, ans, target);
        return ans;
    }
    public void dfs(TreeNode root, List<Integer> arr, List<List<Integer>> ans,int target){
        if(root==null){
            return;
        }
        target-=root.val;
        arr.add(root.val);
        if(root.left== null && root.right==null){
         ArrayList<Integer> list=new ArrayList<>();
            if(target==0){
                list.addAll(arr);
                ans.add(list);
                
            }
        }
        dfs(root.left, arr, ans, target);
        dfs(root.right, arr, ans, target);
           arr.remove(arr.size()-1);
    }
}