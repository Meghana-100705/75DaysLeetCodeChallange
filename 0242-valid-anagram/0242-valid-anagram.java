class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(hmap.containsKey(t.charAt(i))){
            hmap.put(t.charAt(i),hmap.get(t.charAt(i))+1);
        }else{
        hmap.put(t.charAt(i),1);
    }
        }
        for(int i=0;i<s.length();i++){
            if(!hmap.containsKey(s.charAt(i))){
                return false;
            }
            hmap.put(s.charAt(i), hmap.get(s.charAt(i)) - 1);

            if (hmap.get(s.charAt(i)) == 0) {
                hmap.remove(s.charAt(i));
            }
        }
        return hmap.isEmpty();

}
}