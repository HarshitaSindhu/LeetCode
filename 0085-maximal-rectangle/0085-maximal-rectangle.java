class Solution {

   public int[] nextSmallerLeft(int heights[]){
    int N= heights.length;
    int answer[] = new int[N];
    Arrays.fill(answer ,-1);
    Stack<Integer> st = new Stack<>();
       for(int i = N-1;i>=0;i--){
          while(!st.isEmpty()&& heights[st.peek()]>heights[i]){
            answer[st.peek()] = i;
            st.pop();
          }
          st.push(i);
       }
       return answer;

}

     public int [] nextSmallerRight(int []heights){
        int answer[]= new int[heights.length];
                int N= heights.length;

        Arrays.fill(answer,N);
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<N;i++){

            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                answer[st.peek()]  = i ;
                st.pop();
            }
            st.push(i);


        }
        return answer;
        
    }


    public int largestRectangleArea(int[] heights) {
        int N = heights.length;
        int left[]= nextSmallerLeft(heights);
        int right[] = nextSmallerRight(heights);

        int answer = 0;
        for(int i = 0;i<N;i++){
            int width = right[i]-left[i]-1;
            int area = width*heights[i];
            answer = Math.max(answer , area);
        }
        return answer;
    }



   public int maximalRectangle(char[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) return 0;

    int N = matrix.length;
    int M = matrix[0].length;
    int arr[][] = new int[N][M];
    int maxArea = 0;

    // Build histogram heights
    for (int i = 0; i < M; i++) {
        int sum = 0;
        for (int j = 0; j < N; j++) {
            if (matrix[j][i] == '1') {
                sum++;
            } else {
                sum = 0;
            }
            arr[j][i] = sum;
        }
    }

    for (int i = 0; i < N; i++) {
        maxArea = Math.max(maxArea, largestRectangleArea(arr[i]));
    }

    return maxArea;
}
}