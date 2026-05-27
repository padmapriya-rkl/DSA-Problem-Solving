class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] sorted = nums.clone();

        Arrays.sort(sorted);

        for(int i = 0; i < sorted.length; i++) {

            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}
