class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hset=new HashSet<>();
        long len=0;
        int left=0;
        long sum=0;
        for(int right=0;right<nums.length;right++){
            while(hset.contains(nums[right])){
                hset.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            hset.add(nums[right]);
            sum+=nums[right];
            if(right-left+1==k){
                len=Math.max(len,sum);
                hset.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return len;
    }
}   