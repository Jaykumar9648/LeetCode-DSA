class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
   Stack<Integer> st=new Stack<>();
   st.push(0);
   for(int i=0; i<n; i++){
    char ch=s.charAt(i);
    if(ch=='(' ){
    st.push(0);
    }
    else{
      int inner=st.pop();
      int score;
      if(inner==0){
         score=1;
      }
      else{
        score=2 * inner;
      }
      st.push(st.pop() +  score);
    }
   }
   return st.peek();
    }
}