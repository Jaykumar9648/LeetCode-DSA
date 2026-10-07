class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int x:asteroids){
         while(!st.isEmpty() && x<0 && st.peek()>0){
            int sum=x+st.peek();
            if(sum<0){
                st.pop();
            }
            else if(sum>0){
                x=0;
            }
            else{
                st.pop();
                x=0;
            }
         }
            if(x!=0){
                st.push(x);  
            }
         }
        
        int n=st.size();
        int ans[] = new int[n];
        int i=n-1;
        while(!st.isEmpty()){
            ans[i]=st.peek();
            st.pop();
            i--;
        }  
        return ans;       
             }
          
}