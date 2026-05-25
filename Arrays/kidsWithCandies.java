class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            maxi=Math.max(maxi,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=maxi){
                ans.add(true);

            }
            else{
                ans.add(false);
            }
        }return ans;
    }
}
