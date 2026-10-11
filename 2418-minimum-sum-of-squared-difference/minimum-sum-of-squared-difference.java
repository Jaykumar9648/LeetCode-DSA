class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int max=100000;
        int arr[]=new int[max + 1];
        for(int i=0; i<n; i++){
           int d=Math.abs(nums1[i] - nums2[i]);
           arr[d]++;
        }
        int k=k1+k2;
        for(int curr=max; curr>0 && k>0; curr--){
            int countops=Math.min(arr[curr], k);
            arr[curr]-=countops;
            arr[curr-1]+=countops;
            k-=countops;

        }
        long result=0;
    for (int i = 1; i <= max; i++) {
    result += (long) arr[i] * i * i;
}
        return result;
    }
}