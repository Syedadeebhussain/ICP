class Solution {
    public List<Integer> findAnagrams(String s2, String s1) {
     List<Integer> ll=new ArrayList<>();
    int [] freq1=new int [26];
    int [] freq2=new int [26];
    int k=s1.length(); 
    if (k > s2.length()) return ll;
    for(int i=0;i<k;i++){
        freq1[s1.charAt(i)-'a']++;
    }   
    for(int i=0;i<k;i++){
         freq2[s2.charAt(i)-'a']++;
    }
    if(isEqual(freq1,freq2)) ll.add(0);
    for(int i=k;i<s2.length();i++){
        freq2[s2.charAt(i-k)-'a']--;
        freq2[s2.charAt(i)-'a']++;
        if(isEqual(freq1,freq2)) ll.add(i - k + 1); // we have to add 1+index (index that is removed +1 )
    }
    return ll;
    }
    public boolean isEqual(int [] freq1,int [] freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}