class Solution {
    public int[] productExceptSelf(int[] nums) {

        ArrayList<Integer> zeros = new ArrayList<>();
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros.add(i);
                continue;
            }

            product *= nums[i];
        }

        int[] res = new int[nums.length];
        if (zeros.size() >= 2) return res;
        if (zeros.size() == 1) {
            res[zeros.get(0)] = product;
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = product / nums[i];
        }

        return res;
        
    }
}  
