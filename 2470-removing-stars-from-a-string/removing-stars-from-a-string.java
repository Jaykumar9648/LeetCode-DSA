class Solution {
    public String reverse(String ans){
        int n=ans.length();
      String result="";
      for(int i=n-1; i>=0; i--){
          result+=ans.charAt(i);
      }
      return result;
    }
        public String removeStars(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        String ans="";
        for(char ch:s.toCharArray()){
           if(ch == '*'){
            st.pop();
           }
           else{
            st.push(ch);
           }
        }
        while(!st.isEmpty()){
           ans+=st.pop();
        }
        // return  new StringBuilder(ans).reverse().toString();
        return reverse(ans);
    }
}