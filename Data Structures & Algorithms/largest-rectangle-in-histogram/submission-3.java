class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{heights[0], 1});
        int max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] >= st.peek()[0]) {
                st.push(new int[]{heights[i], 1});
            } else {
                int cnt = 0;
                while (!st.isEmpty() && st.peek()[0] > heights[i]) {
                    cnt += st.peek()[1];
                    max = Math.max(st.peek()[0] * cnt, max);
                    st.pop();
                }
                st.push(new int[]{heights[i], cnt+1});
            }

        }

        int cnt = 0;
        while (!st.isEmpty()) {
            cnt += st.peek()[1];
            max = Math.max(st.peek()[0] * cnt, max);
            st.pop();
        }

        return max;
    }
}
