class Solution {
    public int maxSubArray(int[] nums) {
       int cursum=0 ;
       int sum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        cursum=cursum+nums[i];
        sum=Math.max(sum,cursum);
        if(cursum<0){
            cursum=0;
            continue;

        }
       }return sum;
    }
}
