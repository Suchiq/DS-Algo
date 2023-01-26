class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        //0,1,3
        int i = 0;
        for(i = 0;i < n; i++){
            if(i!= nums[i]){
                return i;
            }
        }
        return i;
    }
}