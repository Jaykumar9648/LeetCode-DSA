class Solution {
    public int maxSelectedElements(int[] nums) {

        Arrays.sort(nums);

        HashMap<Integer, Integer> dp = new HashMap<>();

        int ans = 0;

        for (int x : nums) {

            int prevX = dp.getOrDefault(x, 0);
            int prevXMinus1 = dp.getOrDefault(x - 1, 0);
            int prevXPlus1 = dp.getOrDefault(x + 1, 0);

            // Choice 1: Keep x unchanged
            int notModified = prevXMinus1 + 1;

            // Choice 2: Modify x to x + 1
            int modified = prevX + 1;

            dp.put(x, Math.max(prevX, notModified));

            dp.put(x + 1,
                Math.max(prevXPlus1, modified));

            ans = Math.max(ans,
                Math.max(dp.get(x), dp.get(x + 1)));
        }

        return ans;
    }
}