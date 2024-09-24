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
   

    public int maxDepth(TreeNode root) {
        
        return maxDepthHelper(root,0);
       
    }

    public int maxDepthHelper(TreeNode root, int depth){
        
        if(root == null){
            return depth;
        }
        
        int leftHeight = maxDepthHelper(root.left,depth+1);
        int rightHeight = maxDepthHelper(root.right,depth+1);
        
        
        return Math.max(leftHeight,rightHeight);
    }   
}
