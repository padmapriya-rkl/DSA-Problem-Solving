class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int sum=0;
       map.put(0,-1);
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        int remainder=sum%k;
        if(map.containsKey(remainder)){
            int prev=map.get(remainder);
            if(i-prev>1){
                return true;
            }
        }else{
            map.put(remainder,i);
        }
       } return false;
    }
}
