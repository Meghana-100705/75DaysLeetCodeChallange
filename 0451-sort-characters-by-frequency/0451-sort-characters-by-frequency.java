class Solution {
    public String frequencySort(String s) {
        char[] ch=s.toCharArray();
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hmap.put(ch[i],hmap.getOrDefault(ch[i],0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(hmap.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}