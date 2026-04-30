class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= j) {
                j = map.get(c) + 1;
            }
            map.put(c, i);
            res = Math.max(i - j + 1, res);
        }

        return res;
    }
}