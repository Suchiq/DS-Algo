class Solution {

    public int findMin(int[] nums) {
        // need to find pivot element
        return binarySearch(nums);
    }

    public int binarySearch(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) {
            return nums[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            System.out.println(mid);

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
