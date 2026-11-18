class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int count=0;
        for(int i=0; i<n; i+=2){
          char ch=s.charAt(i);
          if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;

    }
}