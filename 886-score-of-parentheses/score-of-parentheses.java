class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int depth=0;
        int score=0;
        for(int i=0; i<n; i++){
          char ch=s.charAt(i);
          if(ch=='('){
            depth++;
          }
          else{
            depth--;
            char prev=s.charAt(i-1);
            if(prev=='('){
               score+=Math.pow(2,depth);
            }
          }
     
        }
        return score;
    }
}