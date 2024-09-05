class Solution {

    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            
            int mid = (start+end)/2;
            
            if(nums[mid] == target){
                
                return mid;
                
            }else if(nums[start]<=nums[mid]){
                //sorted left side
                
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                //sorted right side
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
       return -1;
    }
    
}
