class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        int m=popped.length;
        Stack<Integer> st=new Stack<>();
        int i=0;
        int j=0;
        while(i<n && j<m){
            st.push(pushed[i]);
            while(!st.isEmpty() && popped[j]==st.peek()){
               st.pop();
               j++;
            }
            i++;
        }
        return st.isEmpty();
    }
}