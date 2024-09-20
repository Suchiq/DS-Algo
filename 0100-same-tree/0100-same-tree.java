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
    
   public boolean isSameTree(TreeNode p, TreeNode q) {
            
        if(p == null && q == null){
            return true;
        }
        
        if(p == null || q == null){
            return false;
        }
       
        if(p.val != q.val){
          return false;
        }
      return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
       
    }
  /*   public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null && q == null){
            return true;
        }
        
        if(p == null || q == null){
            return false;
        }
        
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.offer(p);
        q2.offer(q);
        
        while(!q1.isEmpty() && !q2.isEmpty()){
            
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();
            
            if(node1.val!=node2.val){
            
                return false;
            }
             // Check if the left children are the same (either both null or both non-null)
            if (node1.left == null && node2.left != null || node1.left != null && node2.left == null) {
                return false;
            }
            
             // Check if the right children are the same (either both null or both non-null)
            if (node1.right == null && node2.right != null || node1.right != null && node2.right == null) {
                return false;
            }
            
            if(node1.left!=null && node2.left!=null){
                q1.add(node1.left);
                 q2.add(node2.left);
            }
            
           
             if(node1.right!=null && node2.right!=null){
                q1.add(node1.right);
                q2.add(node2.right);
            }
      
        }
        return true;
    } */
}