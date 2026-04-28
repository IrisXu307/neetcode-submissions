class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return false;

        int[] arr = new int[1];
        int[] arr2 = new int[1];
        if (nums[nums.length - 1] >= 0) {arr = new int[nums[nums.length -1] + 1];}
        if (nums[0] < 0) { arr2 = new int[-nums[0] + 1]; }
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