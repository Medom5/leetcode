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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) 
            return new ArrayList<Integer>();
        
        Stack<TreeNode> s = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode current = root.left;
        
        s.push(root);
        
        while(current != null || !s.isEmpty()) {
            while(current != null){
                s.push(current);
                current = current.left;
            }
            
            current = s.pop();
            list.add(current.val);
            current = current.right;
      
        }
        return list;
    }        
}