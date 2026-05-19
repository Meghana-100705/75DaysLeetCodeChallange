class Solution {
    public void rotate(int[] nums, int d) {
        d=d%nums.length;
        rotated(nums,0,nums.length-1);
        rotated(nums,d,nums.length-1);
        rotated(nums,0,d-1);
    }
    static void rotated(int nums[],int a,int b){
        while(a<=b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }

    }
}