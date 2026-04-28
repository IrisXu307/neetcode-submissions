class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        for (int num: nums) {
            if (!map.containsKey(num)) map.put(num, 0);
            map.put(num, map.get(num)+1);
            max = Math.max(max, map.get(num));
        } 

        ArrayList<Integer>[] arr = new ArrayList[max+1];
        for (int i = 0; i <= max; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int key: map.keySet()) {
            arr[map.get(key)].add(key);
        }

        int cnt = 0;
        int[] res = new int[k];
        for (int i = max; i > 0; i--) {
            for (int num : arr[i]) {
                res[cnt++] = num;
                if (cnt == k) return res;
            }
        }
        return res;
    }
}