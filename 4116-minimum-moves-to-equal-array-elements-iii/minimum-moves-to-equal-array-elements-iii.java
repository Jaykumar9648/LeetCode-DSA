class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
              sum+=nums[i];
              if(nums[i]>max){
                max=nums[i];
              }
        }
        return (max*n) - sum;
    }
}