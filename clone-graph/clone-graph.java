/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
            
            return node == null ? null : cloneGraphH(node, new HashMap<Node, Node>());
        }
    public Node cloneGraphH(Node node, HashMap<Node, Node> map) {
        if(map.containsKey(node))
            return map.get(node);
        
        Node n = new Node(node.val);
        map.put(node,n);
        for(Node m : node.neighbors){
                n.neighbors.add(cloneGraphH(m, map));
        }
        
        return n;
    }
}