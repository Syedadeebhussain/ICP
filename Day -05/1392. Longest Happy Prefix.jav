class Solution {
    public String longestPrefix(String s) {
    int [] lps=new int [s.length()];
    int pre=0;
    int suff=1;
    while(suff<s.length()){
        if(s.charAt(pre)==s.charAt(suff)){
           lps[suff]=pre+1;
           pre++;
           suff++;
        }
        else{
            if(pre==0){
                lps[suff]=0;
                suff++;
            }
            else{
                pre=lps[pre-1];
            }
        }
    }  
    return s.substring(0,lps[s.length()-1]);
    }
}