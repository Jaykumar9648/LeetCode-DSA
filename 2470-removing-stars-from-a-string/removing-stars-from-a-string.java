class Solution {
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
        return  new StringBuilder(ans).reverse().toString();
    }
}