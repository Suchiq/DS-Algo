class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] opt = new int[2];

        opt[0] = findfirstPosition(nums, target, 0, nums.length - 1);
        opt[1] = findLastPosition(nums, target, 0, nums.length - 1);
        return opt;
    }

    int findfirstPosition(int[] nums, int target, int start, int end) {
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                start = 0;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }

    int findLastPosition(int[] nums, int target, int start, int end) {
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                start = mid + 1;
                end = nums.length - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }
}
