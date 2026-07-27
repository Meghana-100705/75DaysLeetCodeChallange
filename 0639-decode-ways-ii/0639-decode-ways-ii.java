class Solution {
    public int numDecodings(String s) {
        long dp[]=new long[s.length()];
        Arrays.fill(dp,-1);
        return (int)solve(0,s,dp);
    }
    public long solve(int i,String s,long[] dp){
        if(i==s.length()){
            return 1;
        }
        if(dp[i]!=-1) return dp[i];
        long ans=(ways1(s.charAt(i))*solve(i+1,s,dp))%1000000007;
        if(i+1<s.length()){
            ans+=(ways2(s.charAt(i),s.charAt(i+1))*solve(i+2,s,dp))%1000000007;
        }
        dp[i]=ans%1000000007;
        return dp[i];
    }
    static int ways1(char ch){
        if(ch=='*'){
            return 9;
        }
        if(ch=='0'){
            return 0;
        }
        return 1;
    }
    static int ways2(char a,char b){
        if(a=='*' && b=='*') return 15;
        else if(a=='*'){
            if(b>='0' && b<='6'){
                return 2;
            }
            return 1;
        }
        else if(b=='*'){
            if(a=='1') return 9;
            if(a=='2') return 6;
            return 0;
        }
        int val=(a-'0')*10+b-'0';
        if(val>=10 && val<=26) return 1;
        else return 0;
    }
}