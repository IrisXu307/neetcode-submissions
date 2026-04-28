class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            int[] arr = new int[26];
            for (char c: str.toCharArray()) {
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        for (String key: map.keySet()) {
            result.add(map.get(key));
        }

        return result;

        
    }
}
