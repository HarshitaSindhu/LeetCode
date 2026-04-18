import java.util.*;

class Solution {

    public long subArrayRanges(int[] nums) {
        return subArrayMax(nums) - subArrayMin(nums);
    }

    // 🔽 SUM OF SUBARRAY MINIMUMS
    public long subArrayMin(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        // Next smaller (right)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                right[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            right[st.pop()] = n;
        }

        // Previous smaller (left)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                left[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            left[st.pop()] = -1;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long l = i - left[i];
            long r = right[i] - i;
            sum += l * r * arr[i];
        }

        return sum;
    }

    // 🔼 SUM OF SUBARRAY MAXIMUMS
    public long subArrayMax(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        // Next greater (right)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                right[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            right[st.pop()] = n;
        }

        // Previous greater (left)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                left[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            left[st.pop()] = -1;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long l = i - left[i];
            long r = right[i] - i;
            sum += l * r * arr[i];
        }

        return sum;
    }
}