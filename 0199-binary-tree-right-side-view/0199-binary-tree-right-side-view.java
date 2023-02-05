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
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> rightSideView(TreeNode root) {
        // will do pre order traversal but right first instead of left

        printRightView(root, 0);

        return list;
    }

    public void printRightView(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (list.size() == level) {
            list.add(root.val);
        }
        printRightView(root.right, level + 1);
        printRightView(root.left, level + 1);
    }
}
