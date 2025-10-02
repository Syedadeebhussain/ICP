class Solution {
    public int maximumUnits(int[][] boxTypes, int trucksize) {
    Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
    int sum=0;
    for(int i=0 ;i<boxTypes.length;i++){
        if(trucksize>=boxTypes[i][0]){
            sum+=boxTypes[i][0]*boxTypes[i][1];
            trucksize-=boxTypes[i][0];
        }
        else {
        sum+=trucksize*boxTypes[i][1];
        break;
        }
    }
    return sum;
    }
}   