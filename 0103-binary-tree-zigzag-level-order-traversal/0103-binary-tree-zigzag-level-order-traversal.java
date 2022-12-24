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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean isLeftToRight = true;
        // save in queue for every level
        //if level = 1 then reverse and save
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> currentArray = new ArrayList<>();

            int size = queue.size();

            while (size > 0) {
                TreeNode currNode = queue.poll();
                currentArray.add(currNode.val);
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }

                --size;
            }
          //  for (int i = 0; i < currentArray.size(); i++) {
            //    System.out.println(currentArray.get(i));
            //}
            if (isLeftToRight) {
                isLeftToRight = false;
                ans.add(currentArray);
            } else {
                isLeftToRight = true;
                Collections.reverse(currentArray);
                ans.add(currentArray);
            }
        }
        return ans;
    }
}
