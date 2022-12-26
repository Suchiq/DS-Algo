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
    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxSum(root);
        return result;
    }

    public int findMaxSum(TreeNode root) {
          
       if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, findMaxSum(root.left));
        int rightSum = Math.max(0, findMaxSum(root.right));

        result = Math.max(result, leftSum + rightSum + root.val);

        return Math.max(leftSum, rightSum) + root.val;
    }
}
