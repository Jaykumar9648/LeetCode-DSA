class Solution {
    public String removeKdigits(String s, int k) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        // If k is still remaining, remove from the end
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        ans.reverse();

        // Remove leading zeros
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        String result = ans.substring(i);

        return result.isEmpty() ? "0" : result;
    }
}