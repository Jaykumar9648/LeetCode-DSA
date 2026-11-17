class Solution {

    public int longestMonotonicSubarray(int[] nums) {
        int count1 =1;
        int max1=1;
             for(int i=1; i<nums.length; i++){
             if(nums[i]>nums[i-1]){
             count1++;
             }
             else{
                count1=1;
             }
             max1=Math.max(max1, count1);
        }
            int count2 =1;
             int max2=1;
             for(int i=1; i<nums.length; i++){
             if(nums[i]<nums[i-1]){
             count2++;
             }
                else{
                count2=1;
             }
               max2=Math.max(max2, count2);
        }
        return Math.max(max1, max2);
    }
}