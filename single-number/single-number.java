class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer>mMap = new HashMap();
        
        for(int i = 0;i<nums.length;i++){
            
            if(mMap.containsKey(nums[i])){
                mMap.put(nums[i],mMap.get(nums[i])+1);
            }else
            {
                 mMap.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer>entry:mMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}