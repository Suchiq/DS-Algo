class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
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

        return res;
    }

    private List<List<Integer>> find2Sum(int[] nums, int target, int si) {
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
    }
}
