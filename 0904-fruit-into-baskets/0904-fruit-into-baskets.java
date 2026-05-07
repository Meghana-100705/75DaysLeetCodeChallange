class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<fruits.length;right++){
            hmap.put(fruits[right],hmap.getOrDefault(fruits[right],0)+1);
            while(hmap.size()>2){
                hmap.put(fruits[left],hmap.get(fruits[left])-1);
                if(hmap.get(fruits[left])==0){
                    hmap.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}