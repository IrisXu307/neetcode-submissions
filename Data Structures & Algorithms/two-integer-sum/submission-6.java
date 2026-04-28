class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        Integer[] arr = map.keySet().toArray(new Integer[0]);
        int i = 0, j = arr.length-1;
        while (arr[i] + arr[j] != target) {
            if (arr[i] + arr[j] > target) j--;
            else i++;
        }

        if (i == j) {
            int first = map.get(arr[i]).get(0);
            int second = map.get(arr[i]).get(1);
            if (first > second) return new int[]{second, first};
            return new int[]{first, second};
        }

        int first = map.get(arr[i]).get(0);
        int second = map.get(arr[j]).get(0);
        if (first > second) return new int[]{second, first};
        return new int[]{first, second};
        
        
    }
}
