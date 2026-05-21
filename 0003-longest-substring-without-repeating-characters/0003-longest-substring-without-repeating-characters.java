class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set = new HashSet<>();
        // int left = 0;
        // int maxLen = 0;

        // for (int right = 0; right < s.length(); right++) {
        //     while (set.contains(s.charAt(right))) {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }

        //     set.add(s.charAt(right));
        //     maxLen = Math.max(maxLen, right - left + 1);
        // }

        // return maxLen;
        HashSet<Character> hset=new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++){
            while(hset.contains(s.charAt(right))){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);

        }
        return maxlen;
    }
}