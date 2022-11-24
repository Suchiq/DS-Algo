class Solution {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int pivot = findPivot(nums, start, end);
        System.out.println("pivot"+pivot);

        if (pivot == -1) {
            
            return BS(nums, 0, end, target);
        }
        
        if(nums[pivot] == target){
            return pivot;
        }

        int index1 = BS(nums, start, pivot - 1, target);
        int index2 = BS(nums, pivot, end, target);

        if (index1 > -1) {
            return index1;
        }
        return index2;
    }

    int BS(int[] nums, int start, int end, int target) {
        if (start <= end) {
            if (nums[start]<= nums[end] && nums[start] > target) {
                return -1;
            }

            int mid = start + (end - start) / 2;
             System.out.println("start"+start);
             System.out.println("end"+end);
          System.out.println("mid"+mid);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return BS(nums, start, mid - 1, target);
            } else {
                return BS(nums, mid + 1, end, target);
            }
        }
        return -1;
    }

    
    int findPivot(int[] nums, int start, int end) {
        if (start <= end) {
            if (nums[start] < nums[end]) {
                return start;
            }
            int mid = start + (end - start) / 2;

            if(start==mid) {
                if(nums[start] > nums[end])
                    return end;
                else 
                    return start;
            }
            
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[mid] > nums[start]) {
                return findPivot(nums, mid + 1, end);
            } else {
                return findPivot(nums, start, mid - 1);
            }
        }
        return -1;
    }
  
}
