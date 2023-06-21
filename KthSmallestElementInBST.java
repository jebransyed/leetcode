class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list, k);
        return list.get(k-1);
    }

    private void inOrder(TreeNode node, List<Integer> list, int k) {
        if(node == null) {
            return;
        } else if(list.size() >= k) {
            return;
        } else {
            inOrder(node.left, list, k);
            list.add(node.val);
            inOrder(node.right, list, k);
        }
    }
}
