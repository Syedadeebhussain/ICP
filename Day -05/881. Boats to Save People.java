class Solution {
    public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people);
      int i=0;
      int c=0;
      int j=people.length-1;
      while(i<=j){
        if(people[i]+people[j]<=limit){
            c++;
            i++;
            j--;
        }
        else
        {
            c++;
            j--;
        }
      
      }
      return c;  
    }
}