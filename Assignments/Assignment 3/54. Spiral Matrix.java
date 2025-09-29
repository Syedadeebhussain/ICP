class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
    int minc=0,maxc=arr[0].length-1,minr=0,maxr=arr.length-1;
      List<Integer> result = new ArrayList<>(); 
		int tc=arr.length * arr[0].length;
		int c=0;
		while(c<tc)
		{
			for(int i=minc;i<=maxc && c<tc;i++)
			{
				result.add(arr[minr][i]);
				c++;
			}
			minr++;
			for(int i=minr;i<=maxr && c<tc;i++)
			{
				result.add(arr[i][maxc]);
				c++;
			}
			maxc--;
			for(int i=maxc;i>=minc && c<tc;i--)
			{
				  result.add(arr[maxr][i]);
				c++;
			}
			maxr--;
			for(int i=maxr;i>=minr && c<tc;i--)
			{
				result.add(arr[i][minc]);
				c++;
			}
			minc++;
		}
        return result;
	}

}