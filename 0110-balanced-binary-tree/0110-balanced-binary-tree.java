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
    public boolean isBalanced(TreeNode root) {
        
        //calculate left subtree height
       //calculate right subtree height
        //if diff is less than 0 to 1 then balanced 
    
            
       return (dfs(root,0) !=-1);
        
    }
    
    private int dfs(TreeNode root, int depth){
      //  System.out.println(depth);
      // System.out.println(root.val);
        
        if(root == null){
            return depth;
        }
        
        int leftHeight = dfs(root.left,depth+1);
        int rightHeight = dfs(root.right,depth+1);
        
        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        
        if(Math.abs(rightHeight-leftHeight)>1){
            return -1;
        }
        
        return Math.max(leftHeight, rightHeight);
    }
}