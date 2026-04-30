class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] count = new int[128];
        for (char c : t.toCharArray()) count[c]++;

        int need = t.length();
        int j = 0, resL = 0, resLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c]-- > 0) need--;

            while (need == 0) {
                if (i - j + 1 < resLen) {
                    resLen = i - j + 1;
                    resL = j;
                }
                if (count[s.charAt(j++)]++ == 0) need++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(resL, resL + resLen);
    }
}