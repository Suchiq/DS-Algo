class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mMap = new HashMap();

        for(int i = 0;i <nums.length;i++){
            int secondNum = target-nums[i];
            if(mMap.containsKey(secondNum)){
                return new int[]{i, mMap.get(secondNum)};
            }else{
                mMap.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}