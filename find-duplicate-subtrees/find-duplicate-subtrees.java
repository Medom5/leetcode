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
    private Map<String, Integer> map;
    private List<TreeNode> list;
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>();
        list = new ArrayList<>();
        
        traverse(root);
        
        return list;
        
    }
    
    public String traverse(TreeNode node){
        if(node == null)
            return "^";
        
        String key= node.val + traverse(node.right) + traverse(node.left);
      
        if(map.getOrDefault(key,0) == 1)
            list.add(node);
        
        
        map.put(key,map.getOrDefault(key,0) + 1);
        return key;
    }
    
}