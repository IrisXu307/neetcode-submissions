class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for (int key: map.keySet()) {
            int i = key, j = target-key;
            if (i == j) {
                if (map.get(i).size() == 2) {
                    int first = map.get(i).get(0), second = map.get(i).get(1);
                    if (first < second) return new int[]{first, second};
                    return new int[]{second, first};
                } 
            } else if (map.containsKey(j)) {
                int first = map.get(i).get(0), second = map.get(j).get(0);
                if (first < second) return new int[]{first, second};
                return new int[]{second, first};
            }

        }

        return new int[]{0,1};
        
        
    }
}
