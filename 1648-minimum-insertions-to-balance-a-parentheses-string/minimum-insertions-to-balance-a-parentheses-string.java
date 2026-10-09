class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int count=0;
        int ans=0;
        for(int i=0; i<n; i++){
           if(s.charAt(i)=='('){
              count++;
           }
           else{
            if(count>0){
                count--;
            }
            else{
                ans++;
            }
            if(i+1<n && s.charAt(i+1)==')'){
               i++;
            }
            else{
                ans++;
            }
           }
        }
       
       return ans + (count*2);
       
    }
}