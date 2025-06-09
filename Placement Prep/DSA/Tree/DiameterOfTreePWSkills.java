public class DiameterOfTreePWSkills {
     static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int x) {
                val = x;
                left = null;
                right = null;
            }
     }
     static int max = 0;
     public static int diameterOfBinaryTree(TreeNode root){
          height(root); // Call height to calculate the diameter
          return max; // Return the maximum diameter found
     }

     public static int height(TreeNode root){
          if(root == null) {
               return 0;
          }
          int left = height(root.left);
          int right = height(root.right);

          int diameter = left + right; // Diameter at this node

          max = Math.max(max, diameter); // Update the maximum diameter found so far
          // Return the height of the current node
          // which is 1 + max of left and right subtree heights
          // This is used to calculate the diameter at parent nodes
          // in the recursive calls.         
          return Math.max(left, right) + 1;
     }

     public static void main(String[] args) {
            // Example usage
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
     
            int diameter = diameterOfBinaryTree(root);
            System.out.println("Diameter of the tree: " + diameter); // Output: 3
     }
}
