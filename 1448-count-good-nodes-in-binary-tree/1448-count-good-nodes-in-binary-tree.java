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
    int count = 0;

    public int goodNodes(TreeNode root) {
        findGoodNode(root.val, root);
        return count;
    }

    void findGoodNode(int maxValue, TreeNode root) {
        if (root == null) {
            return;
        }

        //pre order travese
        maxValue = Math.max(maxValue, root.val);

        if (root.val >= maxValue) {
            //System.out.println(root.val + "");
            // System.out.println(good.val + "");
            count++;
        }
        findGoodNode(maxValue, root.left);

        findGoodNode(maxValue, root.right);
    }
}
