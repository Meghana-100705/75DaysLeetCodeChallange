class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length()>t.length()){
        return false; 
       } 
       int count=0;
       int p1=0;
       int p2=0;
       while(p1<s.length()&&p2<t.length()){
        if(s.charAt(p1)==(t.charAt(p2))){
            count++;
            p1++;
            p2++;
        }
        else if(s.charAt(p1)!=(t.charAt(p2))){
            p2++;
        }
       }
       return count==s.length()?true:false;
    }
}