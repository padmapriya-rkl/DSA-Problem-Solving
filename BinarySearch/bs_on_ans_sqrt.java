class Solution {
    public int floorSqrt(int n) {
      int l=1;
      int r=n;
      int ans=1;
      if(n==0){return 0;}
      while(l<=r){
        int mid=l+(r-l)/2;
        if((long)mid*mid<=n){ans=mid;l=mid+1;}
        else{r=mid-1;}
      }return ans;
    }
}
