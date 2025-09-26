class Solution {
    public int[] searchRange(int[] nums, int target) {
    int a=binarysearch(nums,target,true);
    int b=binarysearch(nums,target,false);
    int [] arr={a,b};
    return arr;
}
public int binarysearch(int[] nums,int target,boolean firstfind)
{
    int lo=0;
    int hi=nums.length-1;
    int index=-1;
    int pos=-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(nums[mid]==target){
            pos=mid;
            if(firstfind){
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
          
        }
        else if(nums[mid]>target){
            hi=mid-1;
        }
        else if(nums[mid]<target){
            lo=mid+1;
        }
    }
    return pos;
    }
}
