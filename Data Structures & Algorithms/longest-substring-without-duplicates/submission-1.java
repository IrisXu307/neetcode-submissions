class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                while (s.charAt(j) != s.charAt(i)) {
                    set.remove(s.charAt(j++));
                }
                j++;
            } else {
                set.add(s.charAt(i));
            }
            res = Math.max(i-j+1, res);
        }

        return res;
        
    }
}
