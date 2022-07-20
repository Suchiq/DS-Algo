class Solution {

    public int findPeakElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return 0;
        }

        return peackElement(nums, 0, nums.length - 1);
    }

    int peackElement(int[] nums, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < end && nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (mid == 0) {
                if (nums[mid] > nums[mid + 1]) {
                    return mid;
                } else {
                    return mid + 1;
                }
            } else if (mid == end) {
                if (nums[mid] > nums[mid - 1]) {
                    return mid;
                } else {
                    return mid - 1;
                }
            } else if (mid < end && nums[mid] < nums[mid + 1]) {
                return peackElement(nums, mid + 1,end);
            } else {
                return peackElement(nums, start, mid - 1);
            }
        }
        return -1;
    }
}
