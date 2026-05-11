// Leetcode 1752 Check if Array Is Sorted and Rotated
//solution: deviation 1 or 0 ->true; else false 
class Solution {
    public boolean check(int[] nums) {
    
    int deviation=0;
    for(int i=0;i<nums.length;i++){
        if(i<nums.length-1&&nums[i]>nums[i+1]){
            deviation++;
        }
        else if(i==nums.length-1&&nums[i]>nums[0]){
            deviation++;
        }
    }
    if(deviation<=1){
        return true;
    }
    return false;
    }
}
