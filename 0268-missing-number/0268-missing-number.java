class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int expectedsum=n*(n+1)/2;
        // int actualsum=0;
        // for(int i=0;i<n;i++){
        //     actualsum+=nums[i];
        // }
        // int res=expectedsum-actualsum;
        // return res;
        // int xor=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     xor^=i;
        //     xor^=nums[i];
        // }
        // return xor;
        // int n=nums.length;
        // int expected=n*(n+1)/2;
        // int actual=0;
        // for(int i=0;i<n;i++){
        //     actual+=nums[i];
        // }
        // return expected-actual;
        int n=nums.length;
        int actualsum=n*(n+1)/2;
        int expectedsum=0;
        for(int i=0;i<n;i++){
            expectedsum+=nums[i];
        }
        return actualsum-expectedsum;

    }
}