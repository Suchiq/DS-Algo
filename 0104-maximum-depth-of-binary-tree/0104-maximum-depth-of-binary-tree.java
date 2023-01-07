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
    int max = 0;

    public void dfs(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> s = new Stack<>();
        s.push(new Pair<>(root, 1));

        while (!s.empty()) {
            Pair<TreeNode, Integer> node = s.pop();

            if (node.getValue() > max) {
                max = node.getValue();
            }

            TreeNode n = node.getKey();

            if (n.left != null) {
                s.push(new Pair<>(n.left, node.getValue() + 1));
            }
            if (n.right != null) {
                s.push(new Pair<>(n.right, node.getValue() + 1));
            }
        }
    }

    public int maxDepth(TreeNode root) {
        // dfs(root);
        //return max;
        //int max = 1;
        return findHeight(root);
    }

    int findHeight(TreeNode root) {
        
           
        if (root == null) {
            return 0;
        }
         
        // dfs(root);
        //return max;
      
      int left =  findHeight(root.left);
      int right = findHeight(root.right);

        return Math.max(left,right)+1;
    }
}
