class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int n=arr.length;
    ///making clone of actual array
    int sorted[]=arr.clone();
    Arrays.sort(sorted);
      int  rank=1;
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i=0; i<n; i++){
        if(!mp.containsKey(sorted[i])){
           mp.put(sorted[i], rank);
           rank++;
        }
    }
    for(int i=0; i<n; i++){
        arr[i]=mp.get(arr[i]);
    }
      return arr;
    }
}