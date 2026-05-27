class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        int maxlen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            while(hmap.containsKey(c)&&hmap.get(c)>=left){
                left=left+1;
            }
            hmap.put(c,right);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}