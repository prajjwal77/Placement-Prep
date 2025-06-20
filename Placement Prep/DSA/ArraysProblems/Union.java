public class Union {
     public static int[] union(int[] arr1, int[] arr2) {
          // Create a set to store unique elements
          java.util.Set<Integer> set = new java.util.HashSet<>();

          // Add elements from the first array
          for (int num : arr1) {
               set.add(num);
          }

          // Add elements from the second array
          for (int num : arr2) {
               set.add(num);
          }

          // Convert the set back to an array
          int[] unionArray = new int[set.size()];
          int index = 0;
          for (int num : set) {
               unionArray[index++] = num;
          }

          return unionArray;
     }
     public static void main(String[] args) {
          int[] arr1 = {1, 2, 3, 4, 5};
          int[] arr2 = {4, 5, 6, 7, 8};

          int[] unionArray = union(arr1, arr2);

          System.out.print("Union of the two arrays: ");
          for (int num : unionArray) {
               System.out.print(num + " ");
          }
     }
}
