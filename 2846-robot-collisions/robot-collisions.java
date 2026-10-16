import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(
            int[] positions, int[] healths, String directions) {

        int n = positions.length;

        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices,
            (a, b) -> Integer.compare(positions[a], positions[b]));

        Stack<Integer> stack = new Stack<>();

        for (int idx : indices) {

            if (directions.charAt(idx) == 'R') {
                stack.push(idx);
            } else {

                while (!stack.isEmpty()
                        && healths[idx] > 0
                        ) {


                    int rightRobot = stack.peek();
                           stack.pop();
                    if (healths[rightRobot] > healths[idx]) {
                      healths[rightRobot]-=1;
                        healths[idx] = 0;
                        stack.push(rightRobot);
                    } else if (healths[rightRobot] < healths[idx]) {
                        healths[idx]-=1;
                        healths[rightRobot] = 0;
                    } else {
                       
                        healths[rightRobot] = 0;
                        healths[idx] = 0;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                result.add(healths[i]);
            }
        }

        return result;
    }
}