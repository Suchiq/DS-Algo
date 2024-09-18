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

    public List<List<Integer>> levelOrder(TreeNode root) {
       
        
    List<List<Integer>> output = new ArrayList();
        
       if(root == null){
            return output;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> listNode = new ArrayList();
            int size = queue.size();
            
            for(int i =0;i<size;i++){
                
                TreeNode node = queue.poll();
                
                listNode.add(node.val);
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                }
                
            }
            output.add(listNode);
        }
        
         return output;
}
}