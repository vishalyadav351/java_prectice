class Solution {
    public static int nthDay(int d, int n) {
        int x = n % 7;
        int ans = d - x;
        if (ans < 0) {
            ans = ans + 7;
        }
        return ans;
    }
}