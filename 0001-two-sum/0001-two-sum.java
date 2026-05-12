class Solution {
    public int[] twoSum(int[] nums, int target) {
        // // int[] ans=new int[2];
        // // for(int i=0;i<nums.length;i++){
        // //     for(int j=i+1;j<nums.length;j++){
        // //         if(nums[i]+nums[j]==target){
        // //             ans[0]=i;
        // //             ans[1]=j;
        // //             break;
        // //         }
        // //     }
        // // }
        // // return ans;
        // HashMap<Integer,Integer> hmap=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int c=target-nums[i];
        //     if(hmap.containsKey(c)){
        //         return new int[]{hmap.get(c),i};
        //     }
        //         hmap.put(nums[i],i);
        // }
        // return new int[0];
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}