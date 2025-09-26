class Solution {
    public int shipWithinDays(int[] weights, int days) {
     int lo=0;
     int hi=0;
     int ans=0;
     for(int i=0;i<weights.length;i++){
        lo=Math.max(lo,weights[i]);
        hi+=weights[i];
     }
     while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(ispossible(weights,days,mid)){
           ans=mid;
           hi=mid-1;
        }
        else{
            lo=mid+1;
        }
     }
     return ans;
    }
    public  boolean ispossible(int [] weights,int days,int mid){
        int sum=0;
        int c=1;
        for(int i=0;i<weights.length;i++){
            if((sum+weights[i])<=mid){
                sum+=weights[i];
            }
            else{
                sum=weights[i];
                c++;
            }
            if(c>days){
                return false;
            }
        }
        return true;
    }
}