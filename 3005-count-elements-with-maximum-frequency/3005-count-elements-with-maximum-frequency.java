class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int num:nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        int count=0;
        int max=0;
        for(int num:hmap.values()){
            max=Math.max(num,max);
        }
        //int count=0;
        for(int num:hmap.values()){
            if(num==max){
                count+=max;
            }
        }
        return count;
    }
}