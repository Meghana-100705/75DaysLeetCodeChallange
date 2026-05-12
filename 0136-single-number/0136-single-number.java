class Solution {
    public int singleNumber(int[] nums) {
    //     int n=nums.length;
    //     int res=0;
    //    for(int i=0;i<n;i++){
    //         res=res^nums[i];
    //     }
    //    return res;
        //   int res=0;
        //   for(int i=0;i<nums.length;i++){
        //     res^=nums[i];
        //   }
        //   return res;
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];

        }
        return res;
    }
}