class Solution {
    public int lengthOfLongestSubstring(String s) {
    int si=0;
    int ei=0;
    int ans=0;
    int [] freq=new int[128];
    while(ei<s.length())
      {
       char ch=s.charAt(ei);//grow
       freq[ch]++;
       while(freq[ch]>1)//shrink
       {
        freq[s.charAt(si)]--;
        si++;
       }
        ans=Math.max(ans,ei-si+1);//ans
        ei++;
    }
    return ans;
    }
}