public class TrappingRainWaterProblem {
     public static int maxWater(int[] arr){
          int res =0;
          int n = arr.length;
          int[] left = new int[n];
          int[] right = new int[n];

          left[0] = arr[0];// Fill left array
          for(int i=1;i<n;i++){
               left[i] = Math.max(left[i-1],arr[i]);
          }

          right[n-1] = arr[n-1];// Fill right array
          for(int i = n-2;i>=0;i--){
               right[i] = Math.max(right[i+1],arr[i]);
          }

          for(int i = 1;i< n-1; i++){
               int minOf2 = Math.min(left[i],right[i]);
               res += minOf2 - arr[i]; // Calculate trapped water
          }

          return res;  
     }
     public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 3, 1, 0, 4 };
        System.out.println(maxWater(arr));
     }
}
