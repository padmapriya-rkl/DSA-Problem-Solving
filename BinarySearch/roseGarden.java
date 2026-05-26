class Solution {

    public int roseGarden(int n, int[] nums, int k, int m) {

        // impossible case
        if ((long) m * k > n) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }

        int l = mini;
        int r = maxi;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            int bouq = possibility(mid, nums, k);

            if (bouq >= m) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private static int possibility(int day, int[] nums, int k) {

        int count = 0;
        int bouq = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= day) {
                count++;
            } else {
                bouq += (count / k);
                count = 0;
            }
        }

        // last segment
        bouq += (count / k);

        return bouq;
    }
}
