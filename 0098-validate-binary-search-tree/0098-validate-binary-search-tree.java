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

    public boolean isValidBST(TreeNode root) {
        return validateBST(root, null, null);
    }

    public boolean validateBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null) {
            return true;
        }

        if ((minNode != null && root.val <= minNode.val) || (maxNode != null && root.val >= maxNode.val)) {
            return false;
        }
        boolean leftTree = validateBST(root.left, minNode, root);

        boolean rightTree = validateBST(root.right, root, maxNode);

        if (rightTree && leftTree) {
            return true;
        } else {
            return false;
        }
    }
}
