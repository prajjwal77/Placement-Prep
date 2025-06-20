public class Intersection {
     public static int[] intersection(int[] arr1, int[] arr2) {
          // Create a set to store unique elements from the first array
          java.util.Set<Integer> set = new java.util.HashSet<>();
          
          // Add elements from the first array to the set
          for (int num : arr1) {
               set.add(num);
          }
          
          // Create a list to store the intersection
          java.util.List<Integer> intersectionList = new java.util.ArrayList<>();
          
          // Check elements in the second array against the set
          for (int num : arr2) {
               if (set.contains(num)) {
                    intersectionList.add(num);
               }
          }
          
          // Convert the list back to an array
          int[] intersectionArray = new int[intersectionList.size()];
          for (int i = 0; i < intersectionList.size(); i++) {
               intersectionArray[i] = intersectionList.get(i);
          }
          
          return intersectionArray;
     }
     public static void main(String[] args) {
          int[] arr1 = {1, 2, 3, 4, 5};
          int[] arr2 = {4, 5, 6, 7, 8};

          int[] intersectionArray = intersection(arr1, arr2);

          System.out.print("Intersection of the two arrays: ");
          for (int num : intersectionArray) {
               System.out.print(num + " ");
          }
     }
}
