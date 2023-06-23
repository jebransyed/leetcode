class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer min, Integer max) {
        if(node == null) {
            return true;
        } else if(min != null && node.val <= min) {
            return false;
        } else if(max != null && node.val >= max) {
            return false;
        } else {
            return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
        }
    }

}
