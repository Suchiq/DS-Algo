class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0]<nums[nums.length-1]){
             return nums[0];
        }
      
        return binarySearch(nums,0,nums.length-1);
        
    }
    
   private int binarySearch(int[] nums,int start, int end){
       
       if(start==end){
           return nums[start];
       }
       int mid = start+(end-start)/2;
        
        if(mid>start && nums[mid] < nums[mid-1]){
            
          return nums[mid];
            
        }
         if(mid<end && nums[mid] > nums[mid+1]){
            
           return nums[mid+1];
         }
        if(mid<end && nums[mid]>nums[end]){
            
           return binarySearch(nums, mid+1,end);
            
        }else{
            
          return binarySearch(nums, start,mid-1);
            
        }
       
    }
       
}