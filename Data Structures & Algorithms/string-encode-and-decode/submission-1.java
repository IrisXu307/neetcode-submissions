class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(str.length()).append("|").append(str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        String temp = str;
        while (!temp.isEmpty()) {
            int idx = 0;
            while (temp.charAt(idx) != '|') idx++;
            int len = Integer.parseInt(temp.substring(0, idx));
            String sub = temp.substring(idx+1, idx+1+len);
            res.add(sub);
            temp = temp.substring(idx+1+len);

        }

        return res;


    }
}
