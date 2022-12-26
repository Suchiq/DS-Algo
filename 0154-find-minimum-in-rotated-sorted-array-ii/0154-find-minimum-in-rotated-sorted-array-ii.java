class Solution {

    public int findMin(int[] nums) {
        return binarySearch(0, nums.length - 1, nums);
    }

    private int binarySearch(int start, int end, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (start == end || nums[start] < nums[end]) {
            return nums[start];
        }

        int mid = start + (end - start) / 2;

        if (mid > 0 && nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }
        if (nums[mid] == nums[start]) {
            return binarySearch(start + 1, end, nums);
        }

        if (nums[mid] > nums[start]) {
            return binarySearch(mid + 1, end, nums);
        } else {
            return binarySearch(0, mid, nums);
        }
    }
}
