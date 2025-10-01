class Solution {
    public boolean lemonadeChange(int[] nums) {
       int ten=0,twenty=0,five=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==5){
        five++;
        }
        else if(nums[i]==10){
           ten++;
        if(five==0)
        {
            return false;
        }
        five--;
        }
        else {
            twenty++;
            if(five>=1 && ten>=1)
            {
                five--;
                ten--;
            }
            else if(five>=3){
                 five-=3;
            }
            else {
                return false;
            }
           
        }
       

      }
      return true;   
    }
}