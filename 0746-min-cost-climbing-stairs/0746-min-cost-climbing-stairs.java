class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int One = cost[0];
        int Two = cost[1];
        
        for (int i = 2; i < cost.length; i++) {
            int currentCost = cost[i] + Math.min(One, Two);
            One = Two;
            Two = currentCost;
        }
        
        return Math.min(One, Two);

    }
}