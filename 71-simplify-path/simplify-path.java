class Solution {
    public String simplifyPath(String path) {
      Stack<String> st=new Stack<>();
      String[] tokens=path.split("/");
      for(String token:tokens){
       if(token.equals("") || token.equals(".")){
             continue;
       }
       if(token.equals("..")){
        if(!st.isEmpty()){
            st.pop();
        }
       }
       else{
        st.push(token);
       }
      }
      StringBuilder ans= new StringBuilder();
      for(String dir:st){
         ans.append("/").append(dir);
      }
      return ans.length()==0?"/":ans.toString();
    }
}