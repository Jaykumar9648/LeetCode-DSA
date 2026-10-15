import java.util.Stack;

class Solution {
public int maximumGain(String s, int x, int y) {
int ans = 0;

    // Always remove the higher-scoring pair first
    String first = (x >= y) ? "ab" : "ba";
    String second = (x >= y) ? "ba" : "ab";

    int high = Math.max(x, y);
    int low = Math.min(x, y);

    Stack<Character> stack = new Stack<>();

    // First pass
    for (char c : s.toCharArray()) {
        if (c == first.charAt(1)
                && !stack.isEmpty()
                && stack.peek() == first.charAt(0)) {
            stack.pop();
            ans += high;
        } else {
            stack.push(c);
        }
    }

    // Build the remaining string in its original order
    StringBuilder remaining = new StringBuilder();

    while (!stack.isEmpty()) {
        remaining.append(stack.pop());
    }

    remaining.reverse();

    // Second pass
    Stack<Character> stack2 = new Stack<>();

    for (char c : remaining.toString().toCharArray()) {
        if (c == second.charAt(1)
                && !stack2.isEmpty()
                && stack2.peek() == second.charAt(0)) {
            stack2.pop();
            ans += low;
        } else {
            stack2.push(c);
        }
    }

    return ans;
}


}


