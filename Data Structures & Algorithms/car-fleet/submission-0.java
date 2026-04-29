class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int cnt = 1;
        int n = position.length;

        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int fp = arr[0][0], fs = arr[0][1];
        for (int i = 1;  i < n; i++) {
            int p = arr[i][0], s = arr[i][1];
            if (s <= fs) {
                fp = p; fs = s;
                cnt++;
            } else {
                double t = (fp - p) / (double)(s - fs);
                double d = t * fs + fp;
                if (d > target) {
                    fp = p; fs = s;
                    cnt++;
                }
            }

        }

        return cnt;
        
    }
}
