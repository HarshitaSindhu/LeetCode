class Solution {
    public static boolean noZero(int num){
        while(num > 0){
            int lastDigit = num % 10;
            if(lastDigit == 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];

        int i = 1;
        int j = n - 1;

        while(i <= j){
            if((i + j) == n && noZero(i) && noZero(j)){
                arr[0] = i;
                arr[1] = j;
                break;
            }
            i++;
            j--;
        }
        return arr;
    }
}
