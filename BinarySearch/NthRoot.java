class Solution {

    public int NthRoot(int N, int M) {

        int l = 1;
        int r = M;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            long val = 1;

            for (int i = 0; i < N; i++) {
                val *= mid;

                if (val > M) break;
            }

            if (val == M) {
                return mid;
            }
            else if (val < M) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
