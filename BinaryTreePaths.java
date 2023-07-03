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
    public List<String> binaryTreePaths(TreeNode root) {
        return treeTraversal(root, new ArrayList<String>(), new StringBuilder());
    }

    private List<String> treeTraversal(TreeNode node, List<String> list, StringBuilder sb) {
        if(node == null) {
            return list;
        } else if(node.left == null && node.right == null) {
            sb.append(node.val);
            list.add(sb.toString());
            return list;
        } else {
            sb.append(node.val + "->");
            treeTraversal(node.left, list, new StringBuilder(sb));
            treeTraversal(node.right, list, new StringBuilder(sb));
            return list;
        }
    }
}
