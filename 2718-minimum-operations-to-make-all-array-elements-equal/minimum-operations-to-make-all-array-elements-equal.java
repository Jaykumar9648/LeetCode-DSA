class Solution {
public List<Long> minOperations(int[] nums, int[] queries) {
    Arrays.sort(nums);

    int n = nums.length;

    long[] prefix = new long[n + 1];

    for (int i = 0; i < n; i++) {
        prefix[i + 1] = prefix[i] + nums[i];
    }

    List<Long> ans = new ArrayList<>();

    for (int q : queries) {

        int idx = lowerBound(nums, q);

        long left = (long) q * idx - prefix[idx];

        long right = (prefix[n] - prefix[idx])
                   - (long) q * (n - idx);

        ans.add(left + right);
    }

    return ans;
}

public int lowerBound(int[] nums, int target) {

    int low = 0;
    int high = nums.length;

    while (low < high) {

        int mid = low + (high - low) / 2;

        if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }

    return low;
}

}
