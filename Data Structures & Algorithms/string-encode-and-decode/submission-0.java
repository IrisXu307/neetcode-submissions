class Solution {

    public String encode(List<String> strs) {
        String res = "";

        for (String str: strs) {
            int n = str.length();
            res += n + " " + str + " ";
        }

        return res;

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        String temp = str;
        while (!temp.equals("")) {
            int idx = 0;
            while (temp.charAt(idx) <= '9' && temp.charAt(idx) >= '0') {
                idx++;
            }

            int n = Integer.parseInt(temp.substring(0, idx));
        
            if (n == 0) {
                temp = temp.substring(3);
                res.add("");
            } else {
                String sub = temp.substring(idx+1, idx+1+n);
                temp = temp.substring(idx+n+2);
                res.add(sub);
            }
        }

        return res;

    }
}
