class Solution {
    public boolean isGood(int[] nums) {
         int num = nums.length;
        int[] c = new int[num];
        for (int a : nums) {
            if (a >= num) {
                return false;
            }
            if (a < num - 1 && c[a] > 0) {
                return false;
            }
            if (a == num - 1 && c[a] > 1) {
                return false;
            }
            c[a]++;
        }
        return true;
    }
}