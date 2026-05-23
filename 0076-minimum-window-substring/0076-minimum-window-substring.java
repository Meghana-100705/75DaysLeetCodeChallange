class Solution {
    public String minWindow(String s, String t) {
    int freq[]=new int[123];
    int minlen=Integer.MAX_VALUE;
    int left=0;
    int idx=0;
    int count=0;
    for(char c:t.toCharArray()){
        freq[c]++;
    }
    for(int right=0;right<s.length();right++){
        char ch=s.charAt(right);
        if(freq[ch]>0){
            count++;
        }
        freq[ch]--;
        while(count==t.length()){
            if(right-left+1<minlen){
                minlen=right-left+1;
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
    return minlen==Integer.MAX_VALUE?"":s.substring(idx,idx+minlen);
        
    }
}