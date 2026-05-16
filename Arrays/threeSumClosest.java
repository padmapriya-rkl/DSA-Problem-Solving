class Solution {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int lo = i + 1;
            int hi = n - 1;

            while (lo < hi) {

                int curSum = nums[i] + nums[lo] + nums[hi];

                if (Math.abs(curSum - target) < Math.abs(closestSum - target)) {

                    closestSum = curSum;
                }

                if (curSum == target) {

                    return curSum;

                } else if (curSum < target) {

                    lo++;

                } else {

                    hi--;
                }
            }
        }

        return closestSum;
    }
}
