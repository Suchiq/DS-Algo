class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int j = 0;
       
       while(j<nums.length-1){
           if(nums[j] != nums[j+1]){
               nums[i] = nums[j];
               i++;
               j++;
           }else
           {  
               j++; 
           }
       }
         nums[i] = nums[nums.length-1];
        
        return i+1;
    }
}