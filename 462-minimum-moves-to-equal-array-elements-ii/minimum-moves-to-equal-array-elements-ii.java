class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int move=0;
        int mid=nums[n/2];
        for(int i=0; i<n; i++){
            move+=Math.abs(nums[i]-mid);
        }
      return move;
    }
}