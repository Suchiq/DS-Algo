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
    int sum = 0;
    int depth = 0;

    public int deepestLeavesSum(TreeNode root) {
        depth = maxDepth(root);
        findSum(root, 1);
        return sum;
    }

    void findSum(TreeNode root, int current) {
        if (root != null) {
            if (current == depth) {
                sum = sum + root.val;
            }

            findSum(root.left, current+1);
            findSum(root.right, current+1);
        }
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);

        return Math.max(leftHight, rightHight) + 1;
    }
}
