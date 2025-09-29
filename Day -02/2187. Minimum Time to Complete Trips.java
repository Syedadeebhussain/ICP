class Solution {
    public long minimumTime(int[] time, int totalTrips) {
      long lo=1;
      int min=Integer.MAX_VALUE;
      for(int t:time){
        min=Math.min(t,min);
      }
      long hi=(long)min*totalTrips;
      long ans=0;
      while(lo<=hi){
        long mid=lo+(hi-lo)/2;
        if(ispossible(mid,time,totalTrips)){
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
      }
     return ans;
    }
    public boolean ispossible(long mid,int [] time,int k){
        long trip=0;
        // how many trip one bus can complete in mid time
        for(int i=0;i<time.length;i++){
            trip+=mid/time[i];
        }
        return trip>=k;
    }
}