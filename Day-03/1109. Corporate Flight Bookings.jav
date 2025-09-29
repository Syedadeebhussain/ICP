class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] arr=new int [n];
        for(int [] book:bookings){
            int start=book[0];
            int end=book[1];
            int item=book[2];
                arr[start-1]+=item;
                if(end<arr.length)
                {
                arr[end]-=item;
                }
        }      
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        } 
        return arr;
    }
  
}
