
class Solution {
    public int maximum69Number(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        String ans = "";
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '9') {
                ans += arr[i];
            } else if (arr[i] == '6') {
                ans += '9';

                // Append all remaining digits
                for (int j = i + 1; j < n; j++) {
                    ans += arr[j];
                }

                break;
            }
        }

        int result = Integer.parseInt(ans);
        return result;
    }
}
