class Solution {

    public int[] sortArray(int[] nums) {
        // merge sort

        //divide in small chunkc

        //merge and short that divided array
        if (nums.length == 1) {
            return nums;
        }

        return divideArray(nums, 0, nums.length - 1);
    }

    int[] divideArray(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else if (start == end) {
            return new int[] { nums[start] };
        }

        int mid = start + (end - start) / 2;

        int[] first = divideArray(nums, start, mid);

        int[] second = divideArray(nums, mid + 1, end);

        return merge(first, second);
    }

    public int[] merge(int[] first, int[] second) {
     
        int[] res = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            res[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            res[k] = second[j];
            j++;
            k++;
        }
        return res;
    }
}
