class Solution {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        return BS(nums, start, end, target);
    }

    int BS(int[] nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;

        if (start > end) {
            return -1;
        }

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return BS(nums, 0, mid - 1, target);
        } else {
            return BS(nums, mid + 1, end, target);
        }
    }
}
