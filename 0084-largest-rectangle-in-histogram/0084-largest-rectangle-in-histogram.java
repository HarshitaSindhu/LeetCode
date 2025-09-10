class Solution {

    public int[] nextSmallerLeft(int heights[]){
        int N = heights.length;
        int answer[] = new int[N];
        Arrays.fill(answer, -1);
        Stack<Integer> st = new Stack<>();
        for(int i = N - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                answer[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return answer;
    }

    public int[] nextSmallerRight(int heights[]){
        int N = heights.length;
        int answer[] = new int[N];
        Arrays.fill(answer, N);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < N; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                answer[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return answer;
    }

    public int largestRectangleArea(int[] heights){
        int N = heights.length;
        int left[] = nextSmallerLeft(heights);
        int right[] = nextSmallerRight(heights);

        int answer = 0;
        for(int i = 0; i < N; i++){
            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            answer = Math.max(answer, area);
        }
        return answer;
    }

    public int maximalRectangle(char[][] matrix){
        int N = matrix.length;
        if(N == 0) return 0;
        int M = matrix[0].length;
        int arr[][] = new int[N][M];
        int maxArea = 0;

        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = 0; j < M; j++){  
                if(matrix[i][j] == '1'){
                    if(i == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = arr[i-1][j] + 1;
                } else {
                    arr[i][j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(arr[i]));
        }
        return maxArea;  
    }
}
