class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        
        if(nums.length == 0){
            return 0;
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[start]<nums[end]){
            return nums[start];
        }
        return BinarySearch(nums, start, end);
    }
    
  int  BinarySearch(int[] nums, int start, int end){
      
        if(start == end){
            return nums[start];
        }
        
      if(nums[start]<nums[end]){
            return nums[start];
      }
      
     int mid = start+(end-start)/2;
      
        if(mid>0 && nums[mid]<nums[mid-1]){
            return nums[mid];
        }
        
        if(nums[start]==nums[end]){
          return  BinarySearch(nums, start+1, end);
        }
        
      if(nums[mid]<nums[start]){
         return  BinarySearch(nums, start, mid-1);
      }else{
          return   BinarySearch(nums, mid+1, end);
      }
      
        }
    }
