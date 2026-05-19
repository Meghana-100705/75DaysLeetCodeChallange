class Solution {
    public int maxProfit(int[] nums) {
        //  int minPrice = Integer.MAX_VALUE;
        // int maxProfit = 0;

        // for (int price : prices) {
        //     if (price < minPrice) {
        //         minPrice = price;
        //     } else {
        //         maxProfit = Math.max(maxProfit, price - minPrice);
        //     }
        // }

        // return maxProfit;
        // int min=Integer.MAX_VALUE;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        //     else{
        //         max=Math.max(max,nums[i]-min);
        //     }

        // }
        // return max;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int num:nums){
            if(num<min){
                min=num;
            }
            else{
                max=Math.max(max,num-min);
            }
        }
        return max;
    }
}