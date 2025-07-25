class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i =0;
        int j = n*m-1;

        while(i<= j){
            int mid = (i+j)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col]== target){
                return true;
            }
            else if (matrix[row][col]<target){
                i = mid +1;
            }
                else{
                    j = mid-1;
                }
            }
            return false;
        }
    }
