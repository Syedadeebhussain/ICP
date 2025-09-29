class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double [] arr=new double [m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[i+m]=nums2[i];
        }
        Arrays.sort(arr);
        int n1=arr.length;
        if(n1%2!=0){
            int idx=(n1)/2;
            return arr[idx];
        }
        else{
            int idx1=n1/2;
            return (arr[idx1-1]+arr[idx1])/2;
        }

    }
}