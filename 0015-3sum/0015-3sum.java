class Solution {


    public List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);
        
    Set<List<Integer>> result = new HashSet<>();
 
    for(int i = 0; i < nums.length - 2; i++){
          
        int target = 0 - nums[i];
        int left = i+1;
        int right = nums.length-1;
        
       result = twoSum(target ,left, right, nums,result,nums[i]);

     }
        return new ArrayList<>(result);
    }

    public Set<List<Integer>> twoSum(int target, int left, int right, int[] nums, Set<List<Integer>> result,int firstNum) {

        while(left < right){

            if(nums[left]+nums[right] == target){
               
            result.add(Arrays.asList(firstNum,nums[left],nums[right]));

              left++;
              right--;
               
            }else if(nums[left]+nums[right] < target){
                
                 left++;
                
            }else{
                
                 right--;
                
            }
        }
        return result;
    }
}
        
       /*  
        List<List<Integer>> res = new ArrayList();

        if (nums == null || nums.length < 3) {
            return res;
        }

        Arrays.sort(nums);
        List<List<Integer>> twoNumArray = new ArrayList();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int find = 0 - nums[i];
            twoNumArray = find2Sum(nums, find, i + 1);

            for (int j = 0; j < twoNumArray.size(); j++) {
                List<Integer> opt = twoNumArray.get(j);
                opt.add(nums[i]);
                res.add(opt);
            }
        }

        return res; */  
    

  /*  private List<List<Integer>> find2Sum(int[] nums, int target, int si) {
        int left = si;
        int right = nums.length - 1;
        List<List<Integer>> twoNumArray = new ArrayList();

        while (left < right) {
            if (left != si && nums[left] == nums[left - 1]) {
                left++;
                continue;
            }
            int sum = nums[right] + nums[left];

            if (sum == target) {
                List<Integer> optArr = new ArrayList();
                optArr.add(nums[right]);
                optArr.add(nums[left]);
                twoNumArray.add(optArr);
                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(twoNumArray);
        return twoNumArray;
    }*/  

