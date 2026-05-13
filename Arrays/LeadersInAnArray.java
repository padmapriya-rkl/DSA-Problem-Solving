class Solution {

    public List<Integer> leaders(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;

        int maxi = nums[n - 1];

        ans.add(maxi);

        for(int i = n - 2; i >= 0; i--) {

            if(nums[i] > maxi) {

                ans.add(nums[i]);

                maxi = nums[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}
