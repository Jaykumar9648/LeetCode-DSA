import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long[] squared = new long[n];

        for (int i = 0; i < n; i++) {
            squared[i] = (long) arr[i] * arr[i];
        }

        Arrays.sort(squared);

        long ans1 = 0;
        long ans2 = 0;

        for (int i = 0; i < n / 2; i++) {
            ans1 += squared[i];
        }

        for (int i = n / 2; i < n; i++) {
            ans2 += squared[i];
        }

        return ans2- ans1;
    }
}