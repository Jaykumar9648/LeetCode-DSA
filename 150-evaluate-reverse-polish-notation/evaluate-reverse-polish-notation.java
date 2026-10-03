class Solution {
    public int solve(int a, int b, String token){
       if(token.equals("+")){
        return a+b;
       }
         if(token.equals("-")){
        return a-b;
       }
         if(token.equals("*")){
        return a*b;
       }
            if(token.equals("/")){
        return a/b;
       }
       
        
        return -1;
    }
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> st=new  Stack<>();
        for(int i=0; i<n; i++){
          String token=tokens[i];
          if(token.equals("+")||token.equals("-")|| 
             token.equals("*")||token.equals("/") ){
            int b=st.peek();
            st.pop();
            int a=st.peek();
            st.pop();

            int ans=solve(a, b, token);
            st.push(ans);

          }
          else{
            st.push(Integer.parseInt(token));
          }
        
        }
        return st.peek(); 
    }
}