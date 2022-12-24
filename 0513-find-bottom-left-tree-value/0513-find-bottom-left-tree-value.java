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
    int ans = -1;
    boolean isfound = false;

    public int findBottomLeftValue(TreeNode root) {
        int depth = findHeight(root);
        inOrderTraver(root, depth, 1);
        return ans;
    }

    public void inOrderTraver(TreeNode root, int depth, int level) {
        if (root == null) {
            return;
        }
      //  System.out.println("root"+root.val);
       // System.out.println(level);
        if (root.left == null && root.right == null && depth == level && !isfound) {
            isfound = true;
             // System.out.println("same"+root.val);
            ans = root.val;
        }

        inOrderTraver(root.left, depth, level+1);
        inOrderTraver(root.right, depth, level+1);
    }

    public int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
