class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // HashSet<Integer> hset=new HashSet<>();
        // long len=0;
        // int left=0;
        // long sum=0;
        // for(int right=0;right<nums.length;right++){
        //     while(hset.contains(nums[right])){
        //         hset.remove(nums[left]);
        //         sum-=nums[left];
        //         left++;
        //     }
        //     hset.add(nums[right]);
        //     sum+=nums[right];
        //     if(right-left+1==k){
        //         len=Math.max(len,sum);
        //         hset.remove(nums[left]);
        //         sum-=nums[left];
        //         left++;
        //     }
        // }
        // return len;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        long sum=0;
        long maxsum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            hmap.put(nums[right],hmap.getOrDefault(nums[right],0)+1);
            sum+=nums[right];
            if(right-left+1==k){
                if(hmap.size()==k){
                    maxsum=Math.max(sum,maxsum);
                }
                hmap.put(nums[left],hmap.get(nums[left])-1);
                if(hmap.get(nums[left])==0){
                    hmap.remove(nums[left]);
                }
                sum-=nums[left];
                left++;

            }
        }
        return maxsum;
    }
}   