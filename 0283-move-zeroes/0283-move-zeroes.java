class Solution {
    public void moveZeroes(int[] nums) {
        // int j=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         nums[j]=nums[i];
        //         j++;
        //     }
        // }
        // while(j<nums.length){
        //     nums[j]=0;
        //     j++;
        // }
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]==0){
        //     }
        // }
        // }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }

}