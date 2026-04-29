class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> st = new Stack<>(); //int[2]: temp, idx
        int[] res = new int[n];

        st.push(new int[]{temperatures[0], 0});

        for (int i = 1; i < n; i++) {
            int cur = temperatures[i];

            while (!st.isEmpty() && cur > st.peek()[0]) {
                int[] top = st.pop();
                res[top[1]] = i - top[1];
            }

            st.push(new int[]{cur, i});
            
        }

        return res;
        
    }
}
