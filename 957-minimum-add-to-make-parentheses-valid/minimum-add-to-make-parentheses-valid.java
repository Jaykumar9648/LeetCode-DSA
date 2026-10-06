class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int count=0; 
        int add=0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            //char che=s.charAt(i);
           else if(ch==')' && count>0){
                count--;
                
            }
            else{
                 add++;
            }

        }
         return count+add;
    }
}