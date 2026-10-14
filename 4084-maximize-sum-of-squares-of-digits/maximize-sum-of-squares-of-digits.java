class Solution {
public String maxSumOfSquares(int num, int sum) {
int nine = sum / 9;
int remain = sum % 9;
    if (sum > 9 * num) {
        return "";
    }

    StringBuilder ans = new StringBuilder();

    while (nine > 0 && ans.length() < num) {
        ans.append('9');
        nine--;
    }

    if (remain > 0 && ans.length() < num) {
        ans.append(remain);
    }

    while (ans.length() < num) {
        ans.append('0');
    }

    return ans.toString();
}

}
