class Solution {
    public int findPeakElement(int[] nums) {
        // if(nums.length==1||nums.length==0){
        //     return 0;
        // }
        // if(nums[0]>nums[1]){
        //     return 0;
        // }
        // int res=0;
        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
        //         res=i;
        //     }

        // }
        // if(nums[nums.length-1]>nums[nums.length-2])
        // res= nums.length-1;
        // return res;
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}