class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int moves=0;
        int max=nums[n-1];
        for(int i=0; i<n; i++){
          while(nums[i]<max){
            nums[i]+=1;
            moves++;
          }
        }
        return moves;
    }
}
