class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String sorteds = new String(cs);
        String sortedt = new String(ct);
        if (sorteds.equals(sortedt)) return true;

        return false;

    }
}
