class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> lst=new ArrayList<>(hmap.entrySet());
        lst.sort((a,b)->b.getValue()-a.getValue());
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=lst.get(i).getKey();
        }
        return res;
    }
}