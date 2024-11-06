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
    public int[] findMode(TreeNode root) {
        
      
        HashMap<Integer,Integer> mMap = new HashMap<>();
        
        traverseTree(root,mMap);
        
        ArrayList<Integer> arr = new ArrayList();
        
        int maxFrequency = 0;
        
        for (Map.Entry<Integer, Integer> entry : mMap.entrySet()) {
            
            if(maxFrequency<entry.getValue()){
                
                maxFrequency = entry.getValue();
                arr.clear();
                arr.add(entry.getKey());
                
            }else if(maxFrequency == entry.getValue() ){
                arr.add(entry.getKey());
            }
        }
        
        int[] result = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result ;
    }
    
    public void traverseTree(TreeNode root,  HashMap<Integer,Integer> mMap){
        
          if(root == null){
            return;
              
        }
        
        if(mMap.containsKey(root.val)){
            
            mMap.put(root.val,mMap.get(root.val)+1);
        }else{
              mMap.put(root.val,1);
        }
        
        traverseTree(root.left , mMap);
        traverseTree(root.right, mMap);
    }
}