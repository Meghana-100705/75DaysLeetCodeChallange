class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] ans=new int[nums.length];
        // int pos=0;
        // int neg=1;
        // for(int num:nums){
        //     if(num>0){
        //         ans[pos]=num;
        //         pos+=2;
        //     }
        //     else{
        //         ans[neg]=num;
        //         neg+=2;
        //     }
        // }
        // return ans;
        int[] ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}