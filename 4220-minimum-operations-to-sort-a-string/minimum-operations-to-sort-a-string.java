class Solution {
public int minOperations(String s) {
char[] arr = s.toCharArray();
int n = arr.length;
    // 1. Check if already sorted
    boolean sorted = true;

    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            sorted = false;
            break;
        }
    }

    if (sorted) return 0;

    // 2. An unsorted string of length 2 cannot be sorted
    if (n == 2) return -1;

    // 3. Find minimum and maximum characters
    char minChar = arr[0];
    char maxChar = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] < minChar) minChar = arr[i];
        if (arr[i] > maxChar) maxChar = arr[i];
    }

    // 4. One operation is sufficient
    if (arr[0] == minChar || arr[n - 1] == maxChar) {
        return 1;
    }

    // 5. Check only the middle characters
    for (int i = 1; i < n - 1; i++) {
        if (arr[i] == minChar || arr[i] == maxChar) {
            return 2;
        }
    }

    // 6. Otherwise, three operations are required
    return 3;
}

}
