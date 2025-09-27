class Solution {
    public boolean isPerfectSquare(int num) {
    int lo=0;
    int hi=num;
    int ans=0;
    while(lo<=hi)
    {
        int mid=(lo+hi)/2;
        if(Math.pow(mid,2)==num)
        {
            return true;   
        }
        else if(Math.pow(mid,2)>num)
        {
            hi=mid-1;
        }
        else
        {
            lo=mid+1;
        }
    }
   return false; 

    }
}