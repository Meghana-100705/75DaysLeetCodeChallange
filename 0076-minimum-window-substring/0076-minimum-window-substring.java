class Solution {
    public String minWindow(String s, String t) {
    int freq[]=new int[128];
    int left=0;
    int min=Integer.MAX_VALUE;
    int idx=0;
    int count=0;
    String ans="";
    if(t.length()>s.length()) return "";
    for(int i=0;i<t.length();i++){
        freq[t.charAt(i)]++;
    }
    for(int right=0;right<s.length();right++){
        if(freq[s.charAt(right)]>0){
           count++;
        }
        freq[s.charAt(right)]--;
        while(count==t.length()){
            if(right-left+1<min){
                min=right-left+1;
                idx=left;
            }
            char leftchar=s.charAt(left);
            freq[leftchar]++;
            if(freq[leftchar]>0){
                count--;
            }
            left++;
        }
    }
    return min==Integer.MAX_VALUE?"":s.substring(idx,idx+min);
    }
}