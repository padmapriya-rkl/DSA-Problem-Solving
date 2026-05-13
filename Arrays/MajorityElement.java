//Leetcode 169
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mini=nums.length/2;

        for(int num : nums){
         freq.put(num, freq.getOrDefault(num,0)+1);
         if(freq.get(num)>mini){
            return num;
         }
} return -1;}
    }
