class Solution {
    public int maxOperations(String s) {
        int n = s.length(), cur = 0, ans = 0;
        for(int i = n - 2; i >= 0; --i) {
            if(s.charAt(i) == '1') {
                ans += (s.charAt(i + 1) == '1') ? cur : ++cur;
            }
        }
        return ans;
    }
}