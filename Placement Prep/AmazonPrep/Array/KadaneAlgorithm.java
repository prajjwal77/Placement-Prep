public class KadaneAlgorithm {
     public static int maxSubArray(int[] arr){
          int res = arr[0];
          int currSum = arr[0];
          for (int i = 1; i < arr.length; i++) {
               currSum = Math.max(arr[i], currSum + arr[i]);
               res = Math.max(res, currSum);
          }
          return res;
     }
     public static void main(String[] args) {
            int[] arr = {2, 3, -8, 7, -1, 2, 3};
            System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));

     }
}
