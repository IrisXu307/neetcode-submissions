class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();

        int max = 0;
        for (int num: nums) {
            int[] lr = new int[2];
            if (map.containsKey(num)) continue;
            if (map.containsKey(num-1) && map.containsKey(num+1)) {
                lr[0] = 1 + map.get(num-1)[0];
                lr[1] = 1 + map.get(num+1)[1];
            } else if (map.containsKey(num-1)) {
                lr[0] = 1 + map.get(num-1)[0];
            } else if (map.containsKey(num + 1)) {
                lr[1] = 1 + map.get(num+1)[1];
            }

            map.put(num, lr);
            int leftmost = num - lr[0], rightmost = num + lr[1];
            map.put(leftmost, new int[]{0, rightmost-leftmost});
            map.put(rightmost, new int[]{rightmost-leftmost, 0});
            max = Math.max(rightmost - leftmost+1, max);

        }

        return max;
        
    }
}
