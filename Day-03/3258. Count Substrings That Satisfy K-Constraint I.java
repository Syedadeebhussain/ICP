class Solution {
    public int countKConstraintSubstrings(String s, int k) {
       int si=0;
       int ei=0;
       int c0=0;
       int c1=0;
       int ans=0;
       while(ei<s.length()){

        //grow;
        if(s.charAt(ei)=='0'){
            c0++;
        }
        else{
            c1++;
        }

        //shrink jab hogi jab dono conditions false hogi because it can work on either condition
        while(c0>k && c1>k){
            if(s.charAt(si)=='1'){
                c1--;
            }
            else{
                c0--;
            }
            si++;
        }
        ans=ans+(ei-si+1);
        ei++;
       }
       return ans;
    }
}