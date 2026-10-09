class Solution {
    public String removeOuterParentheses(String s) {
     Stack<Character> st=new Stack<>();
     int n=s.length();
     String ans="";
     int count=0;
     for(int i=0; i<n; i++){
        char ch=s.charAt(i);

         if(ch=='('){
            if(count!=0){
                ans+=ch;;
            }
            count++;
         }
     
     else{
        count--;
        if(count!=0){ 
           ans+=ch;
        }
     }
     }
    //  while(st.size()>0){
    //       ans+=st.pop();
    //  }
     return ans;
    }
}