class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
           if((nums[i]-1)%3==0 || (nums[i]+1)%3==0){
            count++;
           }
           
        }
        return count;
    }
}