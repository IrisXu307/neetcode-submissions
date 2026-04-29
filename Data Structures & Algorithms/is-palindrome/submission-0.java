class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        s = s.toLowerCase();
        while (i < j) {
            while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (j >= 0 && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i >= s.length() || j < 0) return true;
            if (s.charAt(i++) != s.charAt(j--)) return false;

        }

        return true;
        
    }
}
