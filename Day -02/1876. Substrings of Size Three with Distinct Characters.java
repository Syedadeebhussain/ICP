class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
   int c=0;
   Queue<Character> pq=new LinkedList<>();
   for(int i=0;i<3;i++){
    pq.add(s.charAt(i));
    if(ispossible(pq)){
        c++;
    }
   }
    for(int j=3;j<s.length();j++){
        pq.poll();
        pq.add(s.charAt(j));
        if(ispossible(pq)){
        c++;
        }
    }
    return c;
    }
    public boolean ispossible(Queue<Character> pq){
    Set<Character> set = new HashSet<>(pq);
    return set.size() == 3; 
    }
}