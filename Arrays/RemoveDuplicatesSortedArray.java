//Leetcode 26 Remove Dupes from sorted array
// solution: 2 pointer , j and i , i iterate the array , j increment and swap when adj num is diff and continues when adj number are same
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }


        }return j+1;
    }
}
