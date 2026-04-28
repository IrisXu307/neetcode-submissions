class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        int max = nums[0], min = nums[0];

        for (int num: nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        int[] arr = new int[1], arr2 = new int[1];
        if (max >= 0) arr = new int[max + 1];
        if (min < 0) arr2 = new int[-min + 1]; 
    
        for (int num: nums) {
            if (num >= 0) {
                if (arr[num] != 0) {
                    return true;
                }
                arr[num] += 1;

            } else {
                if (arr2[-num] != 0) {
                    return true;
                }
                arr2[-num] += 1;
            }
        }
        return false;
        
    }
}