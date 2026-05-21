class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long max=0;
        int left=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            hmap.put(nums[right],hmap.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                sum-=nums[left];
                hmap.put(nums[left],hmap.get(nums[left])-1);
                if(hmap.get(nums[left])==0){
                    hmap.remove(nums[left]);
                }
            left++;
            }
        if(right-left+1==k&&hmap.size()==k){
            max=Math.max(max,sum);
        }
        }
        return max;
    }
}   