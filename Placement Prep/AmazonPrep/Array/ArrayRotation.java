public class ArrayRotation {
     public static void rotateArray(int[] arr, int k){
          int n = arr.length;
          k%=n; // Handle cases where k is greater than n
          int[] temp = new int[n];
          for(int i=0;i<n-k;i++){
               temp[i] = arr[k+i];
          }
          for(int i = 0; i<k ; i++){
               temp[n-k+i] = arr[i];
          }
          for(int i=0;i<n;i++){
               arr[i] = temp[i];
          }
     }
     public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5};
          int k = 2; // Number of positions to rotate
          rotateArray(arr, k);
          System.out.print("Rotated Array: ");
          for (int num : arr) {
               System.out.print(num + " ");
          }
     }
}
