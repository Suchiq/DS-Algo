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
    List<String> lst = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        findAllPaths(root, root.val+"", lst);
        return lst;
    }

    public void findAllPaths(TreeNode root, String s, List<String> lst) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println(s);
            lst.add(s);
        }
       
        
        if (root.left != null) {
            findAllPaths(root.left, s + "->" + root.left.val, lst);
        }
        
        if (root.right != null) {
            findAllPaths(root.right, s + "->" + root.right.val, lst);
        }
    }
}
