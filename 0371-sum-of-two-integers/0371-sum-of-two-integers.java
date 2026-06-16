class Solution {
    public int getSum(int a, int b) {
       // return a+b;
        while (b != 0) {
            int sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return a;
    }
}