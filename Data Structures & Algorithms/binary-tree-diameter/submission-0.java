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
    public int height(TreeNode node){
        if (node== null) return 0;
        return 1 + Math.max(height(node.left),height(node.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        int left_height= height(root.left); 
        int right_height= height(root.right);
        int diameter = left_height + right_height; 
        int d = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(diameter,d);
    }
}
