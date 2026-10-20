import java.util.*;

class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();

        stack.push(new HashMap<>());

        int i = 0;
        int n = formula.length();

        while (i < n) {
            char ch = formula.charAt(i);

            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            }

            else if (ch == ')') {
                Map<String, Integer> group = stack.pop();
                i++;

                int multiplier = 0;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    multiplier = multiplier * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (multiplier == 0) {
                    multiplier = 1;
                }

                for (String atom : group.keySet()) {
                    int count = group.get(atom) * multiplier;

                    stack.peek().put(
                        atom,
                        stack.peek().getOrDefault(atom, 0) + count
                    );
                }
            }

            else {
                StringBuilder atom = new StringBuilder();
                atom.append(ch);
                i++;

                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    atom.append(formula.charAt(i));
                    i++;
                }

                int count = 0;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    count = count * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (count == 0) {
                    count = 1;
                }

                String name = atom.toString();

                stack.peek().put(
                    name,
                    stack.peek().getOrDefault(name, 0) + count
                );
            }
        }

        Map<String, Integer> result = stack.pop();

        List<String> atoms = new ArrayList<>(result.keySet());
        Collections.sort(atoms);

        StringBuilder answer = new StringBuilder();

        for (String atom : atoms) {
            answer.append(atom);

            int count = result.get(atom);

            if (count > 1) {
                answer.append(count);
            }
        }

        return answer.toString();
    }
}