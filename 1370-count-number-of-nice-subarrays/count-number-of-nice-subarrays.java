class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int ans=0;
        int oddcount=0;
        int n=nums.length;
        mp.put(0,1);
        for(int i=0; i<n; i++){
         if (nums[i] % 2 != 0) { 
            oddcount++;
             }
          if(mp.containsKey(oddcount-k)){
            ans+=mp.get(oddcount-k);
          }
          mp.put(oddcount, mp.getOrDefault(oddcount,0)+1);
        } 
        return ans;
    }
}