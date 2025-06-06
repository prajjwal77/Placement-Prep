public class DiameterOfTree {
     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
     static int diameter = 0;
     public static int diameterOfTree(TreeNode root) {
          calculateHeight(root);
          return diameter;
     }
     private static int calculateHeight(TreeNode node) {
          if (node == null) {
               return 0;
          }
          int leftHeight = calculateHeight(node.left);
          int rightHeight = calculateHeight(node.right);
          
          // Update the diameter if the path through this node is larger
          diameter = Math.max(diameter, leftHeight + rightHeight);
          
          // Return the height of the current node
          return Math.max(leftHeight, rightHeight) + 1;
     }
     // Example usage
     // This will calculate the diameter of the binary tree
     // The diameter is the length of the longest path between any two nodes in the tree
     // where the length is defined as the number of edges in the path.
     // For the given example tree, the diameter is 4 (the path 4 -> 2 -> 1 -> 3 or 5 -> 2 -> 1 -> 3).
     

     public static void main(String[] args) {
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          root.right.left = new TreeNode(6);
          root.right.right = new TreeNode(7);

          System.out.println("Diameter of the tree: " + diameterOfTree(root));
     }
}
