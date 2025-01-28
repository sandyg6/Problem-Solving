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
    private int min(TreeNode root){
        int min = -1;
        while(root != null){
            min = root.val;
            root = root.left;
        }
        return min;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                root.val = min(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}