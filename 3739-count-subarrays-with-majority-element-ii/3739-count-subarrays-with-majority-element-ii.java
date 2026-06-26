class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==target){
        //             count++;
        //         }
        //     if(count>(j-i+1)/2){
        //         c++;
        //     }
        //     }
        // }
        // return c;
        // int[] convert=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         convert[i]=1;
        //     }
        //     else{
        //         convert[i]=-1;
        //     }
        // }
        int n=nums.length;
        int[] pre = new int[n * 2 + 1];
        pre[n] = 1;
        int cnt = n;
        long res = 0;
        long presum = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == target) {
                presum += pre[cnt];
                cnt++;
                pre[cnt]++;
            } else {
                cnt--;
                presum -= pre[cnt];
                pre[cnt]++;
            }
            res += presum;
        }
        return res;
    }
}