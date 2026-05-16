class Solution {
    public int longestConsecutive(int[] nums) {
    //     int longest=0;
    //     for(int i=0;i<nums.length;i++){
    //         int x=nums[i];
    //         int count=1;
    //         while(search(nums,x+1)){
    //             x=x+1;
    //             count+=1;
    //         }
    //         longest=Math.max(count,longest);
    //     }
    //     return longest;
    // }
    //     static boolean search(int nums[],int target){
    //         for(int num:nums){
    //             if(num==target){
    //                 return true;
    //             }
    //         }
    //         return false;
    Arrays.sort(nums);
    int count=1;
    int longest=1;
    if(nums.length==0) return 0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]+1==nums[i+1]){
            count++;
        }
        else if(nums[i]==nums[i+1]){
            continue;
        }
        else{
            longest=Math.max(longest,count);
            count=1;
        }
    }
    longest=Math.max(longest,count);
    return longest;
    }  
}