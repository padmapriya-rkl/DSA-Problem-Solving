class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>Map=new HashMap<>();
       int[]ans= new int[2];
       for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
        if(Map.containsKey(complement)){
            ans[0]=i;
            ans[1]=Map.get(complement);
        }
        else{
            Map.put(nums[i],i);
        }
       } return ans;
    }
}
