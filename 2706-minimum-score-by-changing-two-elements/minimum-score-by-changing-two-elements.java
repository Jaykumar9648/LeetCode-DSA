class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        //sort the array
        Arrays.sort(nums);
        // thre useful condition arr useful to find ans
        //1. AFTER SOTING : 1st element smallest amd last element iss largest
        //change them to find min between theier difference 
        //nums[n-2]-nums[1]
        //2. nums[n-3]-nums[0]
        //3. nums[n-1]-nums[2]

         return Math.min(
            nums[n - 1] - nums[2],
            Math.min(
                nums[n - 2] - nums[1],
                nums[n - 3] - nums[0]
            )
        );
    }
}