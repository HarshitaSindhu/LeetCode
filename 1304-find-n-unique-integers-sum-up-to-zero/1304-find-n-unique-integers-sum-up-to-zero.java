
class Solution {
    public int[] sumZero(int n) {
        int i = 0;
        int j = n - 1;
        int arr[] = new int[n];
        
        if (n % 2 == 0) {
            // Even case: fill pairs symmetrically
            while (i < j) {
                arr[i] = i + 1;
                arr[j] = -(i + 1);
                i++;
                j--;
            }
        } else {
            // Odd case: place 0 in the middle, fill pairs symmetrically
            arr[i] = 0;
            i++;
            while (i < j) {
                arr[i] = i;
                arr[j] = -i;
                i++;
                j--;
            }
        }
        
        return arr;
    }
}

























// class Solution {
//     public int[] sumZero(int n) {
//         int i = 0;
//         int j = n-1;
//         int arr[] = new int[n];
//         while(i<n &&j>0){
//            if(n%2==0){
//             arr[i] = i;
//             arr [j] =-i;
//             i++;
//             j--;
//         }
//         else{
//             arr[i]= 0;
//             arr[i+1] = i+1;
//             arr[j] = -(i+1);
//             i++;
//             j--;
//         }
//         }
//         return arr;
//     }
// }