class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Integer, Node> hm = new HashMap<>();
        return deepClone(node, hm);
    }

    private Node deepClone(Node node, HashMap<Integer, Node> hm) {
        if(node == null) {
            return node;
        }
        Node copy = new Node(node.val);
        hm.put(node.val, copy);
        for(Node n:node.neighbors) {
            if(hm.containsKey(n.val)) {
                copy.neighbors.add(hm.get(n.val));
            } else {
                Node clone = deepClone(n, hm);
                copy.neighbors.add(clone);
            }
        }
        return copy;
    }

}
