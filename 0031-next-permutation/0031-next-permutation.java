class Solution {
    public void nextPermutation(int[] nums) {
        int ans=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ans=i;
                break;
            }
        }
        if(ans==-1){
            int l=0;
            int r=nums.length-1;
            while(l<r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
            return;
        }
        int min=Integer.MAX_VALUE;
        for(int i=ans+1;i<nums.length;i++){
            if(nums[i]>nums[ans]){
                min=i;
            }
        }
        int temp=nums[ans];
        nums[ans]=nums[min];
        nums[min]=temp;
        int left=ans+1;
        int right=nums.length-1;
        while(left<right){
            int t=nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
    }
}