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
    private boolean Sum(TreeNode root, int curr, int targetSum){
        if(root == null){
            return false;
        }
        int sum = root.val + curr;

        if(sum == targetSum && root.left == null && root.right == null){
            return true;
        }
        return Sum(root.left, sum, targetSum) || Sum(root.right, sum, targetSum);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return Sum(root, 0, targetSum);
    }
}