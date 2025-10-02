class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder st=new StringBuilder();
     for(int i=0;i<s.length();i++){
         st.append(s.charAt((i+k)%s.length()));
     }   
     return st.toString();
    }
}