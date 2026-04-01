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
    
    List<Integer> order = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        for (int i = 0; i < order.size() - 1; i++) {
            if (order.get(i) >= order.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        order.add(node.val);
        inOrder(node.right);
    }
}