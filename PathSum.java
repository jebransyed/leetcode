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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int currentSum) {
        if(root == null) {
            return false;
        } else if(isLeafNode(root) && (currentSum + root.val) == targetSum) {
            return true;
        } else {
            int newSum = currentSum + root.val;
            return hasPathSum(root.left, targetSum, newSum) || hasPathSum(root.right, targetSum, newSum);
        }
    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
