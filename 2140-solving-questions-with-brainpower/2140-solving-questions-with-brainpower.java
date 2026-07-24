class Solution {
    static int points[];
    static int brainpower[];
    static int n;
    static long dp[];
    public long mostPoints(int[][] questions) {
        points=new int[questions.length];
        brainpower=new int[questions.length];
        dp=new long[questions.length];
        n=questions.length;
        Arrays.fill(dp,(long)-1);
        for(int i=0;i<questions.length;i++){
            points[i]=questions[i][0];
            brainpower[i]=questions[i][1];
        }
        return solve(0);
    }
    private static long solve(int i){
        if(i>=n) return 0;
        if(dp[i]!=(long)-1) return dp[i];
        long skip=solve(i+1);
        long score=points[i]+solve(i+brainpower[i]+1);
        dp[i]=Math.max(skip,score);
        return dp[i];
    }
}